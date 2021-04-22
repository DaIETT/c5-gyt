package exer1;

import java.util.Stack;
import java.util.Vector;

/**
 * @author Gyt
 * @create 2021-04-22 - 17:46
 */
public class Exer1 {

    /**
     * 题目一：反转链表
     * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
     *
     * @param args
     */
    public static void main(String[] args) {
        ListNode head = new ListNode(); //头链表 不存放数据
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;

        //原
        showNode(head);
        //逆转
        ListNode reserveNode = reserveNode(head);
        showNode(reserveNode);


        //合并
        ListNode head1 = new ListNode(); //头链表 不存放数据
        ListNode head2 = new ListNode(); //头链表 不存放数据

        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        head1.next = l11;
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(0);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(5);
        head2.next = l21;
        l21.next = l22;
        l22.next = l23;
        showNode(head1);
        showNode(head2);
        ListNode newNode = mixNode(head1, head2);
        showNode(newNode);


        //回文
        ListNode head3 = new ListNode();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(2);
        ListNode f = new ListNode(1);
        head3.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        boolean huiwen = isHuiwen(head3);
        if(huiwen) {
            System.out.println("是回文");
        } else {
            System.out.println("不是回文");
        }

    }

    /**
     * 反转链表
     * <p>
     * 思路： 头插法
     *
     * @param headNode 头指针
     */
    public static ListNode reserveNode(ListNode headNode) {
        //临时节点 用于遍历原链表
        ListNode cur = headNode.next;
        //临时节点2 用于指向cur-next
        ListNode nextNode = null;
        //新链表的 头
        ListNode head2 = new ListNode();


        while (cur != null) {
            nextNode = cur.next;
            cur.next = head2.next;
            head2.next = cur;

            cur = nextNode;
        }

        return head2;
    }

    /**
     * 合并链表
     * <p>
     * 双指针法
     *
     * @param headNode1
     * @param headNode2
     * @return
     */
    public static ListNode mixNode(ListNode headNode1, ListNode headNode2) {
        //遍历链表1
        ListNode temp1 = headNode1.next;
        //遍历链表2
        ListNode temp2 = headNode2.next;

        //新链表
        ListNode headNew = new ListNode();
        //新链表的末尾
        ListNode rearNew = headNew;

        //先让新链表头 指向小的那个链表
        if (temp1.val < temp2.val) {
            headNew.next = temp1;
        } else {
            headNew.next = temp2;
        }

        //开始判断
        while (temp1.next != null || temp2.next != null) {
            if (temp1.val < temp2.val) {
                //让rear=temp1  并且temp1后移 temp2不动
                rearNew.next = temp1;
                rearNew = temp1;
                temp1 = temp1.next;
                rearNew.next = null;
            } else {
                //让rear=temp2 temp2后移  temp1不动
                rearNew.next = temp2;
                rearNew = temp2;
                temp2 = temp2.next;
                rearNew.next = null;
            }
        }

        //最后的边界单独判断
        if (temp1.val < temp2.val) {
            rearNew.next = temp1;
            rearNew.next.next = temp2;
        } else {
            rearNew.next = temp2;
            rearNew.next.next = temp1;
        }

        return headNew;

    }


    /**
     * 判断是否为回文链表
     *
     * @param headNode
     */
    public static boolean isHuiwen(ListNode headNode) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = headNode.next;

        while (temp != null) {
            stack.add(temp.val);
            temp = temp.next;
        }

        while (temp != null) {
            if (stack.pop() != temp.val) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }


    /**
     * 遍历链表
     *
     * @param headNode
     */
    public static void showNode(ListNode headNode) {
        ListNode temp = headNode.next;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


}


/**
 * 模拟链表
 */
class ListNode {
    int val;  //链表中节点的值
    ListNode next;  //引用

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
    }
}


