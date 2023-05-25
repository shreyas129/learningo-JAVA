public class Hello36 {
    public static void main(String a[]) {
        StringBuffer sb = new StringBuffer("Shreyas");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Tathode");
        System.out.println(sb);

        sb.insert(0, "Java ");
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.setLength(30);
        System.out.println(sb);

        sb.ensureCapacity(100);
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(sb);
    }
}
