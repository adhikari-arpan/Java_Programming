package URL_Processing;
import java.net.*;

public class UrlProcessing {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.example.com:443/path/to/resource?query=java#section1");
        System.out.println("Protocol:" + url.getProtocol()); 
        System.out.println("Hostname:" + url.getHost());
        System.out.println("Port:" + url.getPort());
        System.out.println("Default Port:" + url.getDefaultPort());
        System.out.println("Path:" + url.getPath());
        System.out.println("File:" + url.getFile());
        System.out.println("Query String:" + url.getQuery());
        System.out.println("Ref:" + url.getRef());
    }
}
