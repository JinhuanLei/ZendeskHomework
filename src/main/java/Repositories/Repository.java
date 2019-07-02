package Repositories;

import java.io.InputStreamReader;
import java.util.List;

public interface Repository<R> {
    public List<R> queryThings(List<R> result, String term, String value) throws Exception;

    public InputStreamReader init();
}
