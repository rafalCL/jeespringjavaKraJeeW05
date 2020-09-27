package pl.coderslab.zaddom4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fileCustomerLogger")
public class FileCustomerLogger implements CustomerLogger {
    private String filename;

    public FileCustomerLogger() {
    }

    public String getFilename() {
        return filename;
    }

    @Value("plix.log")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void log() {
        System.out.println("zapisuje loga do pliku: "+filename);
    }
}
