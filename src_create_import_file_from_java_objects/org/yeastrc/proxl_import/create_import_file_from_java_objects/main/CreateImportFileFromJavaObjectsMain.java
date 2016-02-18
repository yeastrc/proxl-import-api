package org.yeastrc.proxl_import.create_import_file_from_java_objects.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.yeastrc.proxl_import.api.xml_dto.ProxlInput;


/**
 * 
 *
 */
public class CreateImportFileFromJavaObjectsMain {
	
//	private static final Logger log = Logger.getLogger(CreateImportFileFromJavaObjectsMain.class);

	// private constructor
	private CreateImportFileFromJavaObjectsMain() { }
	
	public static CreateImportFileFromJavaObjectsMain getInstance() { 
		return new CreateImportFileFromJavaObjectsMain(); 
	}
	
	
	/**
	 * @param outputFile
	 * @param proxlInput
	 * @throws Exception
	 */
	public void createImportFileFromJavaObjectsMain( File outputFile, ProxlInput proxlInput ) throws Exception {
		

		OutputStream outputStream = null;
		
		try {

			outputStream = new FileOutputStream(outputFile);
			
			createImportFileFromJavaObjectsMain( outputStream, proxlInput );
		} finally {
			
			if ( outputStream != null ) {
				
				outputStream.close();
			}
		}
	}
	
	

	/**
	 * @param outputStream
	 * @param proxlInput
	 * @throws Exception
	 */
	public void createImportFileFromJavaObjectsMain( OutputStream outputStream, ProxlInput proxlInput ) throws Exception {
		
		JAXBContext jaxbContext = JAXBContext.newInstance( ProxlInput.class );

		Marshaller marshaller = jaxbContext.createMarshaller();


		marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );

//		marshaller.setProperty( Marshaller.JAXB_ENCODING, CommonConstants.FILE_ENCODING );


		
		try {
			
			marshaller.marshal(proxlInput, outputStream);
			
		} finally {
			
		}
		
		
	}
}
