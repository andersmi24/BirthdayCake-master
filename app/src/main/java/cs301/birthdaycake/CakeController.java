package cs301.birthdaycake;

public class CakeController  extends CakeView{
    private CakeView cakeV;
    private CakeModel cakeM;

    public CakeController(CakeView cakeViewObj){
        super(cakeViewObj);
        cakeV = cakeViewObj;

        cakeM = getCakeModel();

    }

}
