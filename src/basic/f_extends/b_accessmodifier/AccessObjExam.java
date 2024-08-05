package basic.f_extends.b_accessmodifier;

public class AccessObjExam {

    public static void main(String[] args) {
        AccessObj obj = new AccessObj();
        System.out.println(obj.p);
        System.out.println(obj.p2);
        System.out.println(obj.k);
        // System.out.println(obj.i); // private 이므로 접근 불가


    }
}
