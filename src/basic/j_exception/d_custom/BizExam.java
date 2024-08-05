package basic.j_exception.d_custom;

public class BizExam {

    public static void main(String[] args) {
        BizService biz = new BizService();
        biz.bizMethod(3);

        try {
            biz.bizMethod(-3);
        } catch (BizException ex) {
            ex.printStackTrace();
        }
    }
}
