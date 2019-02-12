package sessionBean;

import javax.ejb.Stateless;

@Stateless
public class AddBean implements AddBeanLocal {

    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }
}