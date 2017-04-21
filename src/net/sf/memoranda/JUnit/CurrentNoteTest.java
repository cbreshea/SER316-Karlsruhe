package net.sf.memoranda.JUnit;

import java.util.Collection;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

import mockit.Deencapsulation;
import net.sf.memoranda.CurrentNote;
import net.sf.memoranda.Note;
import net.sf.memoranda.NoteListener;

@Generated(value = "org.junit-tools-1.0.5")
public class CurrentNoteTest {

	private CurrentNote createTestSubject() {
		return new CurrentNote();
	}

	@MethodRef(name = "get", signature = "()QNote;")
	@Test
	public void get() throws Exception {
		Note result;

		// default test
		result = CurrentNote.get();
	}

//	@MethodRef(name = "set", signature = "(QNote;Z)V")
//	@Test
//	public void set() throws Exception {
//		Note note = null;
//		boolean toSaveCurrentNote = false;
//
//		// default test
//		CurrentNote.set(note, toSaveCurrentNote);
//	}

//	@MethodRef(name = "reset", signature = "()V")
//	@Test
//	public void reset() throws Exception {
//
//		// default test
//		CurrentNote.reset();
//	}

	@MethodRef(name = "addNoteListener", signature = "(QNoteListener;)V")
	@Test
	public void addNoteListener() throws Exception {
		NoteListener nl = null;

		// default test
		CurrentNote.addNoteListener(nl);
	}

	@MethodRef(name = "getChangeListeners", signature = "()QCollection<QNoteListener;>;")
	@Test
	public void getChangeListeners() throws Exception {
		Collection<NoteListener> result;

		// default test
		result = CurrentNote.getChangeListeners();
	}

	@MethodRef(name = "noteChanged", signature = "(QNote;Z)V")
	@Test
	public void noteChanged() throws Exception {
		Note note = null;
		boolean toSaveCurrentNote = false;

		// default test
		Deencapsulation.invoke(CurrentNote.class, "noteChanged", new Object[] { Note.class, toSaveCurrentNote });
	}
}