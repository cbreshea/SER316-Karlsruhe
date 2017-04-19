/**
 * NoteListImpl.java
 * Created on 21.02.2003, 15:43:26 Alex
 * Package: net.sf.memoranda
 *
 * @author Alex V. Alishevskikh, alex@openmechanics.net
 * Copyright (c) 2003 Memoranda Team. http://memoranda.sf.net
 */
package net.sf.memoranda;
import java.util.Collection;
import java.util.Vector;

import net.sf.memoranda.date.CalendarDate;
import net.sf.memoranda.date.CurrentDate;
import net.sf.memoranda.util.Util;
import nu.xom.Attribute;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

public class NoteListImpl implements NoteList {

	private Project project_1 = null;
	private Document doc_1 = null;
	private Element root_1 = null;

	//    public static final String NS_JNNL = "http://www.openmechanics.org/2003/jnotes-noteslist";

	/**
	 * Constructor for NoteListImpl.
	 */
	public NoteListImpl(Document doc, Project prj) {
		doc_1 = doc;
		root_1 = doc_1.getRootElement();
		project_1 = prj;
	}

	public NoteListImpl(Project prj) {
		//root_1 = new Element("noteslist", NS_JNNL);
		root_1 = new Element("noteslist");
		doc_1 = new Document(root_1);
		project_1 = prj;
	}

	public Collection<Note> getAllNotes() {
		Vector<Note> v = new Vector<Note>();
		Elements yrs = root_1.getChildElements("year");
		for (int yi = 0; yi < yrs.size(); yi++) {
			Year y = new Year(yrs.get(yi));
			Vector<Month> ms = y.getMonths();
			for (int mi = 0; mi < ms.size(); mi++) {
				Month m = (Month) ms.get(mi);
				Vector<Day> ds = m.getDays();
				for (int di = 0; di < ds.size(); di++) {
					Day d = (Day) ds.get(di);
					Vector<NoteElement> ns = d.getNotes();
					for(int ni = 0; ni < ns.size(); ni++) {
						NoteElement ne = (NoteElement) ns.get(ni);
						v.add((Note) new NoteImpl(ne.getElement(), project_1));
					}
				}
			}
		}
		return v;
	}

	/**
	 * @see net.sf.memoranda.NoteList#getMarkedNotes()
	 */
	public Collection<Note> getMarkedNotes() {
		Vector<Note> v = new Vector<Note>();
		Elements yrs = root_1.getChildElements("year");
		for (int yi = 0; yi < yrs.size(); yi++) {
			Year y = new Year(yrs.get(yi));
			Vector<Month> ms = y.getMonths();
			for (int mi = 0; mi < ms.size(); mi++) {
				Month m = (Month) ms.get(mi);
				Vector<Day> ds = m.getDays();
				for (int di = 0; di < ds.size(); di++) {
					Day d = (Day) ds.get(di);
					Vector<NoteElement> ns = d.getNotes();
					for(int ni = 0; ni < ns.size(); ni++) {
						NoteElement ne = (NoteElement) ns.get(ni);
						Note n = new NoteImpl(ne.getElement(), project_1);
						if (n.isMarked())
							v.add(n);
					}
				}
			}
		}
		return v;
	}

	public Collection<Note> getNotesForPeriod(CalendarDate startDate, CalendarDate endDate) {
		Vector<Note> v = new Vector<Note>();
		Elements yrs = root_1.getChildElements("year");
		for (int yi = 0; yi < yrs.size(); yi++) {
			Year y = new Year(yrs.get(yi));
			if ((y.getValue() >= startDate.getYear()) && (y.getValue() <= endDate.getYear())) {
				Vector<Month> months = y.getMonths();
				for (int mi = 0; mi < months.size(); mi++) {
					Month m = (Month) months.get(mi);
					if (!((y.getValue() == startDate.getYear()) && (m.getValue() < startDate.getMonth()))
							|| !((y.getValue() == endDate.getYear()) && (m.getValue() > endDate.getMonth()))) {
						Vector<Day> days = m.getDays();
						for (int di = 0; di < days.size(); di++) {
							Day d = (Day) days.get(di);
							if (!((m.getValue() == startDate.getMonth()) && (d.getValue() < startDate.getDay()))
									|| !((m.getValue() == endDate.getMonth()) && (d.getValue() > endDate.getDay()))) {
								Vector<NoteElement> ns = d.getNotes();
								for(int ni = 0; ni < ns.size(); ni++) {
									NoteElement ne = ns.get(ni);
									v.add((Note) new NoteImpl(ne.getElement(), project_1));
								}
							}
						}
					}
				}
			}
		}
		return v;
	}

	/**
	 * returns the first note for a date.
	 * @param CalendarDate
	 * @return Note
	 */

	public Note getNoteForDate(CalendarDate date) {
		Day d = getDay(date);
		if (d == null)
			return null;
		Vector<NoteElement> ns = d.getNotes();
		if(ns.size()>0) {
			NoteElement n = (NoteElement) ns.get(0);
			Note currentNote = new NoteImpl(n.getElement(), project_1);
			return currentNote;
		}
		return null;
		//return new NoteImpl(d.getElement(), project_1);
	}

	public Note createNoteForDate(CalendarDate date) {
		Year y = getYear(date.getYear());
		if (y == null)
			y = createYear(date.getYear());
		Month m = y.getMonth(date.getMonth());
		if (m == null)
			m = y.createMonth(date.getMonth());
		Day d = m.getDay(date.getDay());
		if (d == null)
			d = m.createDay(date.getDay());
		NoteElement ne = d.createNote(Util.generateId());
		return new NoteImpl(ne.getElement(), project_1);
	}

	public void removeNote(CalendarDate date, String id) {
		Day d = getDay(date);
		if (d == null) return;
		Vector<NoteElement> ns = d.getNotes();
		for(int i=0;i<ns.size();i++) {
			NoteElement n = (NoteElement) ns.get(i);
			Element ne = n.getElement();
			if(ne.getAttribute("refid").getValue().equals(id)) d.getElement().removeChild(n.getElement());
		}
	}

	public Note getActiveNote() {
		return getNoteForDate(CurrentDate.get());
	}

	private Year getYear(int y) {
		Elements yrs = root_1.getChildElements("year");
		String yy = new Integer(y).toString();
		for (int i = 0; i < yrs.size(); i++)
			if (yrs.get(i).getAttribute("year").getValue().equals(yy))
				return new Year(yrs.get(i));
		return null;
	}

	private Year createYear(int y) {
		Element el = new Element("year");
		el.addAttribute(new Attribute("year", new Integer(y).toString()));
		root_1.appendChild(el);
		return new Year(el);
	}

	private Day getDay(CalendarDate date) {
		Year y = getYear(date.getYear());
		if (y == null)
			return null;
		Month m = y.getMonth(date.getMonth());
		if (m == null)
			return null;
		return m.getDay(date.getDay());
	}

	/*
	 * private class Year
	 */
	private class Year {
		Element yearElement = null;

		public Year(Element el) {
			yearElement = el;
		}

		public int getValue() {
			return new Integer(yearElement.getAttribute("year").getValue()).intValue();
		}

		public Month getMonth(int m) {
			Elements ms = yearElement.getChildElements("month");
			String mm = new Integer(m).toString();
			for (int i = 0; i < ms.size(); i++)
				if (ms.get(i).getAttribute("month").getValue().equals(mm))
					return new Month(ms.get(i));
			return null;
		}

		private Month createMonth(int m) {
			Element el = new Element("month");
			el.addAttribute(new Attribute("month", new Integer(m).toString()));
			yearElement.appendChild(el);
			return new Month(el);
		}

		public Vector<Month> getMonths() {
			Vector<Month> v = new Vector<Month>();
			Elements ms = yearElement.getChildElements("month");
			for (int i = 0; i < ms.size(); i++)
				v.add(new Month(ms.get(i)));
			return v;
		}
	}

	/*
	 * private class Month
	 */
	private class Month {
		Element mElement = null;

		public Month(Element el) {
			mElement = el;
		}

		public int getValue() {
			return new Integer(mElement.getAttribute("month").getValue()).intValue();
		}

		public Day getDay(int d) {
			if (mElement == null)
				return null;
			Elements ds = mElement.getChildElements("day");
			String dd = new Integer(d).toString();
			for (int i = 0; i < ds.size(); i++)
				if (ds.get(i).getAttribute("day").getValue().equals(dd))
					return new Day(ds.get(i));
			return null;
		}

		private Day createDay(int d) {
			Element el = new Element("day");
			el.addAttribute(new Attribute("day", new Integer(d).toString()));
			mElement.appendChild(el);
			return new Day(el);
		}

		public Vector<Day> getDays() {
			if (mElement == null)
				return null;
			Vector<Day> v = new Vector<Day>();
			Elements ds = mElement.getChildElements("day");
			for (int i = 0; i < ds.size(); i++)
				v.add(new Day(ds.get(i)));
			return v;
		}
	}

	/*
	 * private class Day
	 */
	private class Day {
		Element dEl = null;

		public Day(Element el) {
			dEl = el;
			// Added to fix old '.notes' XML format
			// Old-style XML is converted on the fly [alexeya]
			if (dEl.getAttribute("date") != null) {
				Attribute dAttr = dEl.getAttribute("date");
				Attribute tAttr = dEl.getAttribute("title");
				Element nEl = new Element("note");
				String date = dAttr.getValue().replace('/', '-');
				nEl.addAttribute(new Attribute("refid", date));
				nEl.addAttribute(new Attribute("title", tAttr.getValue()));
				dEl.appendChild(nEl);
				dEl.removeAttribute(dAttr);
				dEl.removeAttribute(tAttr);
			}
		}

		public int getValue() {
			return new Integer(dEl.getAttribute("day").getValue()).intValue();
		}

		public NoteElement createNote(String d) {
			Element el = new Element("note");
			dEl.appendChild(el);
			return new NoteElement(el);
		}

		public Vector<NoteElement> getNotes() {
			if (dEl == null)
				return null;
			Vector<NoteElement> v = new Vector<NoteElement>();
			Elements ds = dEl.getChildElements("note");
			for (int i = 0; i < ds.size(); i++)
				v.add(new NoteElement(ds.get(i)));
			return v;
		}

		public Element getElement() {
			return dEl;
		}
	}

	private class NoteElement {
		Element nEl;

		public NoteElement(Element el) {
			nEl = el;
		}

		public Element getElement() {
			return nEl;
		}
	}

	public Document getXMLContent() {
		return doc_1;
	}
}
