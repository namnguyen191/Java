package sessionBean;

import javax.ejb.Local;

@Local
public interface AddBeanLocal {

    int add(int num1, int num2);
    
}
