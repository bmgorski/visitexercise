package edu.stthomas.test;

import java.io.File;
import java.io.FileWriter;

import com.hilbertinc.base.HException;
import com.sun.xml.internal.stream.writers.XMLWriter;

import edu.stthomas.node.NodeTraversal;
import edu.stthomas.node.HTMLWriterVisitor;

/**
 * This is a disposable class that I am using for unit testing the framework
 */
public class HTMLWriterVisitorUnitTest {
	/**
	 * UnitTest constructor comment.
	 */
	public HTMLWriterVisitorUnitTest() {
		super();
	}

	/**
	 * Starts the application.
	 * 
	 * @param args
	 *            an array of command-line arguments
	 */
	public static void main(java.lang.String[] args) {
		@SuppressWarnings("unused")
		HTMLWriterVisitorUnitTest tester = new HTMLWriterVisitorUnitTest();

		if (0 == args.length) {
			System.err.println("Syntax: java COM.hilbertinc.xml.UnitTest <xmldocument>");
		}

		try {
			System.out.print("Parsing... ");

			NodeTraversal parser = new NodeTraversal();
			parser.parse(args[0]);

			System.out.print("You reading from: " + args[0]);

			if (null == parser.getDocument()) {
				System.out.println("Document was not successfully parsed");
				System.out.println("If there are no error messages, it is probably an inability to find the DTD");
				return;
			}
			
			System.out.println("... Done.");

			System.out.print("Dumping contents of parsed document... ");
			try {
				HTMLWriterVisitor dumper = new HTMLWriterVisitor();
				dumper.setWriter(new XMLWriter(new FileWriter(new File(args[1]))));

				parser.traverse(dumper);
				dumper.flush();
				System.out.println("Done.");
			} catch (Exception exception) {
				throw new HException(exception,
						"Error dumping the contents of the document");
			}
		} catch (HException exception) {
			System.err.println("Exception...");
			exception.print();
		}
	}
}