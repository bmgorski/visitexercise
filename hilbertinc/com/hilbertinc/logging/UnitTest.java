package com.hilbertinc.logging;

import java.io.File;
import java.io.FileWriter;

import com.hilbertinc.base.HException;
import com.hilbertinc.xml.HDOMParser;
import com.hilbertinc.xml.HDumperVisitor;
import com.sun.org.apache.bcel.internal.classfile.Field;
import com.sun.xml.internal.stream.writers.XMLWriter;

/**
 * This is a disposable class that I am using for unit testing the framework
 */
public class UnitTest {
	/**
	 * UnitTest constructor comment.
	 */
	public UnitTest() {
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
		UnitTest tester = new UnitTest();

		if (0 == args.length) {
			System.err
					.println("Syntax: java COM.hilbertinc.xml.UnitTest <xmldocument>");
			return;
		}

		try {
			System.out.println("Parsing...");

			HDOMParser parser = new HDOMParser();
			parser.parse(args[0]);
			
			System.out.println("You reading from: " + args[0]);
			
			
			if (null == parser.getDocument()) {
				System.out.println("Document was not successfully parsed");
				System.out
						.println("If there are no error messages, it is probably an inability to find the DTD");
				return;
			}

			System.out.println("Done.  Dumping contents of parsed document.");
			try {
				HDumperVisitor dumper = new HDumperVisitor();
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
		return;
	}
}