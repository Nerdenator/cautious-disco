package c02_test;

import org.junit.Assert;
import org.junit.Test;

import c02_src.LinkedList;
import c02_src.P4_Partition;

public class P4_PartitionTest {

	LinkedList<Integer> list = new LinkedList<Integer>(new Integer[] { 1, 2, 10, 5, 8, 5, 3 });

	@Test
	public void testPartitionNotStable() {
		Assert.assertEquals("[3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1]", list.toString());
		P4_Partition.partitionNotStable(list, 5);
		Assert.assertEquals("[1 -> 2 -> 3 -> 5 -> 8 -> 5 -> 10]", list.toString());
	}

	@Test
	public void testPartitionStable() {
		Assert.assertEquals("[3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1]", list.toString());
		P4_Partition.partitionStable(list, 5);
		Assert.assertEquals("[3 -> 2 -> 1 -> 5 -> 8 -> 5 -> 10]", list.toString());
	}

}
