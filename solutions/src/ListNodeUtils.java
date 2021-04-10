/**
 * @author lvchaoxian
 * @date 2021/4/10 3:38 下午
 */
public class ListNodeUtils {
    public static void printListNode(ListNode listNode) {
        StringBuilder sb = new StringBuilder();
        ListNode p = listNode;
        while (p != null) {
            sb.append(p.val);
            p = p.next;
            if (p != null) {
                sb.append(" -> ");
            }
        }
        System.out.println(sb);
    }
}
