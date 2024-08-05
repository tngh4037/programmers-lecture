package basic.f_extends.b_accessmodifier.otherpackage;

import basic.f_extends.b_accessmodifier.AccessObj;

public class AccessObjExam2 {

    public static void main(String[] args) {
        AccessObj obj = new AccessObj();
        System.out.println(obj.p);
        // System.out.println(obj.p2); // 같은 패키지가 아니므로 접근 불가
        // System.out.println(obj.k); // 같은 패키지가 아니므로 접근 불가
        // System.out.println(obj.i); // private 이므로 접근 불가
    }
}
