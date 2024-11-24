public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
        if (bt.empty()) 
            return 0;
	bt.find(Relative.Root);
        
        return count(bt);
    }

    private static <T> int count(BT<T> bt) {
	if (bt.isLeaf()) 
            return 1;
	    int right=0,left=0;
	    if(bt.find(Relative.LeftChild())){
		    left= count(bt);
		    bt.find(Relative.Parent();}
	    if(bt.find(Relative.RightChild())){
		    right=count(bt);
		    bt.find(Relative.Parent();}
	    
        return left+right;
    }
}
