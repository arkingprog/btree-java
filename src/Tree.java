/**
 * Created by artem on 02.09.2015.
 */
public class Tree<T extends  Comparable<T> > {

    class TreeItem
    {
        public T value;
        public TreeItem left;
        public TreeItem right;
        public TreeItem parent;

        public TreeItem(T value,TreeItem parent,TreeItem left,TreeItem right)
        {
            this.value=value;
            this.parent=parent;
            this.left=left;
            this.right=right;
        }
        public TreeItem(T value,TreeItem parent)
        {
            this.value=value;
            this.parent=parent;
            this.left=null;
            this.right=null;
        }
    }
    TreeItem root=null;

    public void Add(T value)
    {
        if(root==null){
            root=new TreeItem(value,null);
            return;
        }
        else
        {
            Add(value,this.root)
        }
    }

    private void Add(T value, TreeItem item) {
        if(item.left.value.compareTo(value)==0)
        {
            return;
        }
        if(item.left.value.compareTo(value)>0)
        {
            if(item.left==null){
                item.left=new TreeItem(value,item);
            }
            else
            {
                Add(value,item.left);
            }
        }
        else
        {
            if(item.right==null){
                item.right=new TreeItem(value,item);
            }
            else
            {
                Add(value,item.right);
            }
        }

    }
}
