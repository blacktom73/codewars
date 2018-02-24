package main.java.hu.mitro.paginationhelper;

import java.util.Arrays;
import java.util.List;

/***
 * For this exercise you will be strengthening your page-fu mastery. You will complete the
 * PaginationHelper class, which is a utility class helpful for querying paging information related
 * to an array.
 *
 * The class is designed to take in an array of values and an integer indicating how many items will
 * be allowed per each page. The types of values contained within the collection/array are not
 * relevant.
 *
 * The following are some examples of how this class is used:
 *
 * @author Mitró Tamás
 *
 * @param <I>:
 *            Type of the elements on the pages
 *
 */
public class PaginationHelper<I> {

	private int itemsPerPage;
	private List<I> collection;
	private int pageCount;

	/**
	 * The constructor takes in an array of items and a integer indicating how many items fit within
	 * a single page
	 */
	public PaginationHelper(List<I> collection, int itemsPerPage) {
		this.collection = collection;
		this.itemsPerPage = itemsPerPage;
		if (collection.size() % itemsPerPage == 0) {
			pageCount = (collection.size() / itemsPerPage);
		} else {
			pageCount = (collection.size() / itemsPerPage) + 1;
		}
	}

	/**
	 * returns the number of items within the entire collection
	 */
	public int itemCount() {
		return collection.size();
	}

	/**
	 * returns the number of pages
	 */
	public int pageCount() {
		return pageCount;
	}

	/**
	 * returns the number of items on the current page. page_index is zero based. this method should
	 * return -1 for pageIndex values that are out of range
	 */
	public int pageItemCount(int pageIndex) {
		if (pageIndex < pageCount - 1) {
			return itemsPerPage;
		} else if (pageIndex == pageCount - 1) {
			return (collection.size() / itemsPerPage) + 1;
		} else {
			return -1;
		}
	}

	/**
	 * determines what page an item is on. Zero based indexes this method should return -1 for
	 * itemIndex values that are out of range
	 */
	public int pageIndex(int itemIndex) {
		if (itemIndex < 0 || itemIndex > collection.size() - 1) {
			return -1;
		} else {
			return itemIndex / itemsPerPage;
		}
	}

	public static void main(String[] args) {
		PaginationHelper<Character> helper = new PaginationHelper(
				Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
		System.out.println("page count: " + helper.pageCount()); // should == 2
		System.out.println("item count: " + helper.itemCount()); // should == 6
		System.out.println("page item count(0): " + helper.pageItemCount(0)); // should == 4
		System.out.println("page item count(1): " + helper.pageItemCount(1)); // last page - should
																				// == 2
		System.out.println("page item count(2): " + helper.pageItemCount(2)); // should == -1 since
																				// the page is
																				// invalid
		// pageIndex takes an item index and returns the page that it belongs on
		System.out.println("page index(5): " + helper.pageIndex(5)); // should == 1 (zero based
																		// index)
		System.out.println("page index(2): " + helper.pageIndex(2)); // should == 0
		System.out.println("page index(20): " + helper.pageIndex(20)); // should == -1
		System.out.println("page index(-10): " + helper.pageIndex(-10)); // should == -1
	}
}