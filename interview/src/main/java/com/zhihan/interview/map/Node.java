package com.zhihan.interview.map;

public class Node<K, V> {
	
	int hash;
	K key;
	V value;
	Node<K, V> next;
	
	public Node(int hash, K key, V value, Node<K, V> next){
		this.hash = hash;
		this.key = key;
		this.value = value;
		this.next = next;
	}
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Node<String, String>[] node = new Node[1];
		
		Node<String, String> a = new Node<String, String>(97, "a", "a", null);
		
		Node<String, String> e = new Node<String, String>(0, "0", "0", a);

		
		/**
		 * 1 next = e.next；2 e = next；4 node[0] = e；所以 node[0] == e == next == e.next；三个变量最后都指向e.next
		 * 即：后面的变量(e)指向上面的变量(next)，那么后面的变量(e)也指向上面的变量(next)实际的指向的变量(e.next)
		 * 因为第一个变量(next)没有重新赋值
		 * 
		 * 3 e.next = node[0]；4 node[0] = e；所以 e.next != e
		 * 即 上面的变量(e.next)指向一个具体引用(node[0])，接下来，上面的具体引用(node[0])又指向一个新的具体引用(e)
		 * 那么上面的变量(e.next)和下面接下来新的具体引用(e)不相等
		 * 因为具体引用(node[0])有重新赋值
		 */
		Node<String, String> next = e.next; // 1
		
		e = next;							// 2
		
		e.next = node[0];					// 3
		
		node[0] = e;						// 4
		
		
		System.out.println("next:" + next.value); // "a"
		
		System.out.println("e:" + e.value);	// "a"
		
		System.out.println("e.next:" + e.next); // null
		
		System.out.println("node[0]:" + node[0].value); // "a"
		
		
		
	}

}
