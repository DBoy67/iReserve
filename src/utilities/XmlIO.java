package utilities;



import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;

/**
 * Simplified XML file loading and saving of Plain Old Java Objects (POJO)
 * 
 * Note: should store an object, ArrayList needs generic info so store
 * the list with declaration inside another POJO for loading.
 * 
 * @author Jonas Lund
 */
public class XmlIO {

    /**
     * Load an object from the contents of an XML file.
     * This function will automatically match the data to the clazz parameter.
     * 
     * @param <T> The type of object you want to load
     * @param fileName the file to load from
     * @param clazz a reference to the Class of the type to load.
     * @return an object of the type matching the passed in clazz
     * @throws IOException 
     */
    public static <T> T loadObject(String fileName,Class<T> clazz) throws IOException {
        try {
            JAXBContext ctx=JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller=ctx.createUnmarshaller();
            JAXBElement<T> out = unmarshaller.unmarshal(new StreamSource(new File(fileName)),clazz);
            return out.getValue();
        } catch (JAXBException ex) {
            throw new IOException(ex);
        }
    }
    
    /**
     * Simple function to save a plain java object to an XML file.
     * 
     * @param fileName the name to write the object to
     * @param obj the object to write
     * @throws IOException 
     */
    public static void saveObject(String fileName,Object obj) throws IOException {
        try {
            JAXBContext ctx=JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = ctx.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            marshaller.marshal(new JAXBElement(new QName("root"),obj.getClass(),obj), new File(fileName));
        } catch (JAXBException ex) {
            throw new IOException(ex);
        }
    }
}
