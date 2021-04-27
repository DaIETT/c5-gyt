package exer;

/**
 * @author Gyt
 * @create 2021-04-26 - 16:51
 */
public class Link {

    public static void main(String[] args) {

        //合并链表的展示 略  上次做过


        //删除重复元素
        ListNode head = new ListNode(); //头链表 不存放数据
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(2);

        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        showNode(deleteDuplicates(head));


        //环
        ListNode head1 = new ListNode(); //头链表 不存放数据
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        head1.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n2;

        System.out.println("有环吗：" + hasCycle(head1));
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
    public static ListNode test1(ListNode headNode1, ListNode headNode2) {
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
     * 2. 存在一个按升序排列的链表，给你这个链表的头节点 head ，
     * 请你删除所有重复的元素，使每个元素 只出现一次 。
     * <p>
     * 思路：双指针法
     *
     * @param head
     */
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode p = head.next;
        ListNode temp = p.next;

        while (temp != null) {

            while (temp.val == p.val) {
                p.next = temp.next;

                if (temp.next == null) {
                    break;
                }
                temp = temp.next;

            }

            p = temp;
            temp = temp.next;

        }


        return head;
    }


    public static boolean hasCycle(ListNode head) {
        ListNode tortoise = head.next;  //一次走1步

        ListNode rabbit = tortoise.next;    //一次走2步


        while (rabbit != null) {

            if (rabbit.next == null) {
                //无环路
                return false;

            } else {

                if (tortoise == rabbit) {
                    return true;
                }
            }

            tortoise = tortoise.next;
            rabbit = rabbit.next.next;//走两步


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
