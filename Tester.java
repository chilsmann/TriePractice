//Created By Cameron Hilsmann

public class Tester{
   public static void main(String [] args){
      Trie2 myTrie = new Trie2();
      
      myTrie.insertString("apple");
		myTrie.insertString("bike");
		myTrie.insertString("bake");
		myTrie.insertString("pen");
		myTrie.insertString("did");
      myTrie.insertString("ape");
		myTrie.insertString("child");
		myTrie.insertString("cat");
		myTrie.insertString("file");
		myTrie.insertString("hello");
      myTrie.insertString("he");
      myTrie.insertString("hell");
      
      myTrie.wordsPrefixedBy("ap");
      myTrie.wordsPrefixedBy("he");

   
   }//end main
   
}//end class