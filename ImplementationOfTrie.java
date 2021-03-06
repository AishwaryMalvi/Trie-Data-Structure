package Trie;

public class ImplementationOfTrie {
	
	private TrieNode root;
	
	
	public ImplementationOfTrie() {
		root = new TrieNode();     		//root is empty
	}
	
	private class TrieNode{
		
	private TrieNode[] children;
	private boolean isword;
	
	public TrieNode() {
		this.children = new TrieNode[26]; //starting english words - a-> z
		this.isword = false;
	}
	}
	
	public void insert(String word)
	{
		if(word == null || word.isEmpty()) {
			throw new IllegalArgumentException("Invalid input");
		}
		word = word.toLowerCase();
		
		TrieNode current = root;
		for(int i=0;i<word.length();i++) {
			char c = word.charAt(i);
			int index = c-'a';
			if(current.children[index] == null) {
				TrieNode node = new TrieNode();
				current.children[index] = node;
				current = node;
			}
			else {
				current = current.children[index];
			}
		}
		current.isword = true;
	}
	
	public boolean search(String word) {
		return false;
	}
	public static void main(String[] args) {
		ImplementationOfTrie trie = new ImplementationOfTrie() ;
		trie.insert("cat");
		trie.insert("cab");
		trie.insert("son");
		trie.insert("so");
		System.out.print("value inserted Successfully");
		
	}
}


