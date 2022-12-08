@SuppressWarnings("serial") //autogenerate this with eclipse
public class EmptyCollectionException extends RuntimeException //pulled directly from powerpoint (chp 12 on blackboard).
{

    public EmptyCollectionException(String collection)
    {
        super("The " + collection + " is empty.");
    }
}