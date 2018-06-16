import java.util.Iterator;

public class FactIterator implements Iterator<Fact> {



    public FactIterator(FactRepository factRepository) {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Fact next() {
        return null;
    }
}