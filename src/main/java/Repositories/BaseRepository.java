package Repositories;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public abstract class BaseRepository<R> implements Repository {

    protected abstract String getResourceName();


    @Override
    public InputStreamReader init() {
        InputStream inputStream;
        InputStreamReader reader;
        try {
            inputStream = this.getClass().getResourceAsStream(getResourceName());
            reader = new InputStreamReader(inputStream);
        } catch (Exception e) {
            System.out.println("File Not Found");
            return null;
        }
        return reader;
    }
}
