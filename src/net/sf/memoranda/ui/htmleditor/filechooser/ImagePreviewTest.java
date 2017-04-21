package net.sf.memoranda.ui.htmleditor.filechooser;

import java.awt.Graphics;
import java.beans.PropertyChangeEvent;

import javax.annotation.Generated;
import javax.swing.JFileChooser;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.0.5")
public class ImagePreviewTest {

	private ImagePreview createTestSubject() {
		return new ImagePreview(new JFileChooser());
	}

	@MethodRef(name = "loadImage", signature = "()V")
	@Test
	public void loadImage() throws Exception {
		ImagePreview testSubject;

		// default test
		testSubject = createTestSubject();
		testSubject.loadImage();
	}

//	@MethodRef(name = "propertyChange", signature = "(QPropertyChangeEvent;)V")
//	@Test
//	public void propertyChange() throws Exception {
//		ImagePreview testSubject;
//		PropertyChangeEvent e = new ;
//
//		// default test
//		testSubject = createTestSubject();
//		testSubject.propertyChange(e);
//	}

	@MethodRef(name = "paintComponent", signature = "(QGraphics;)V")
	@Test
	public void paintComponent() throws Exception {
		ImagePreview testSubject;
		Graphics g = null;

		// default test
		testSubject = createTestSubject();
		testSubject.paintComponent(g);
	}
}