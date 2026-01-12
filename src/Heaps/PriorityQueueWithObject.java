package Heaps;

import java.util.PriorityQueue;

public class PriorityQueueWithObject {
	static class Student implements Comparable<Student>{
		String name;
		int rank;
		public Student(String name , int rank) {
			this.name = name;
			this.rank = rank;
		}
		@Override
		public int compareTo(Student s2) {
			return this.rank - s2.rank;
		}
	}
	public static void main(String []args) {
		PriorityQueue<Student> pq = new PriorityQueue<>();
		
		pq.add(new Student("a" , 1));
		pq.add(new Student("b" , 8));
		pq.add(new Student("c" , 7));
		pq.add(new Student("d" , 5));
		pq.add(new Student("e" , 3));
		
		
		while(!pq.isEmpty()) {
			System.out.println(pq.peek().name + " " + pq.peek().rank);
			pq.remove();
		}
	}
}
