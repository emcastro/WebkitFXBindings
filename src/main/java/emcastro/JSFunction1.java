package emcastro;

/**
 * Created by ecastro on 05/12/16.
 */
@JSInterface
public interface JSFunction1<A, R> extends JSFunction {

    R call(A a);

}