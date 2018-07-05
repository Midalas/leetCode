package leetCode;

public class leetCode138 {

	public static void main(String[] args) throws Exception {

		RandomListNode root = new RandomListNode(1);
		RandomListNode temp = root;
		temp.next = new RandomListNode(2);
		temp = temp.next;
		temp.next = new RandomListNode(3);
		temp = temp.next;
		temp.next = new RandomListNode(4);
		temp = temp.next;
		temp.next = new RandomListNode(5);
		temp = temp.next;

		root.random=root.next.next.next;//(1→4)
		root.next.random=root.next.next.next.next;//(2→5)
		root.next.next.random=root;//(3→1)
		root.next.next.next.random=root.next.next;//(4→3)
		root.next.next.next.next.random=root;//(5→1)
		
		RandomListNode x=copyRandomList(root);
		
		System.out.println();

	}
	
	public static RandomListNode copyRandomList(RandomListNode head) {
		if(head==null)
			return null;
		RandomListNode temp=head;
		//复制lable
		while(temp!=null){
			RandomListNode copy=new RandomListNode(temp.label);
			RandomListNode now=temp.next;
			copy.next=temp.next;
			temp.next=copy;
			temp=now;
		}
		//复制随机指针
		RandomListNode h1=head;
		while(h1!=null){
			if(h1.random!=null)
				h1.next.random=h1.random.next;
			h1=h1.next.next;
		}
		//断开新旧链表
		RandomListNode h2=head;
		RandomListNode newHead=head.next;
		while(h2!=null){
			RandomListNode copy=h2.next;
			h2.next=copy.next;
			h2=h2.next;
			copy.next=h2==null?null:h2.next;
		}
		
        return newHead;
    }


}
