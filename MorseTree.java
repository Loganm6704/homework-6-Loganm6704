import java.util.Scanner;

public class MorseTree<T> {
    private T element;
    private MorseTree<T> left;
    private MorseTree<T> right;

    public MorseTree(T element){
        this.element = element;
    }

    public T getElement(){
        return element;
    }

    public MorseTree<T> getLeft(){
        return left;
    }

    public MorseTree<T> getRight(){
        return right;
    }

    public void setElement(T element){
        this.element = element;
    }

    public void setLeft(MorseTree<T> left){
        this.left = left;
    }

    public void setRight(MorseTree<T> right){
        this.right = right;
    }

    public void insertLeft(T element){
        if (this.getLeft() == null){
            this.setLeft(new MorseTree<T>(element));
        }
        else{
            System.out.println("Cannot insert element");
        }
    }

    public void insertRight(T element){
        if (this.getRight() == null){
            this.setRight(new MorseTree<T>(element));
        }
        else{
            System.out.println("Cannot insert element");
        }
    }

    public void setTree(){
        
    }

    public void preOrder(MorseTree<T> node){
        if (node == null){
            return;
        }
        System.out.println(node.getElement());
        preOrder(node.getLeft());
        postOrder(node.getRight());
    }

    public void postOrder(MorseTree<T> node){
        if (node == null){
            return;
        }
        preOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.println(node.getElement());
    }

    public boolean isIn(T target){
        if (this.getElement().equals(target)){
            return true;
        }
        else if (this.getLeft() == null && this.getRight() == null){
            return false;
        }
        else{
            if (this.getRight() != null && this.getLeft() != null){
                return this.getLeft().isIn(target) || this.getRight().isIn(target);
            }
            else if (this.getRight() == null && this.getLeft() != null){
                return this.getLeft().isIn(target);
            }
            else if (this.getRight() != null && this.getLeft() == null){
                return this.getRight().isIn(target);
            }
            else{
                return false;
            }
        }
    }

    public String morseTrans(T target, String temp){
        String morseStr = "" + temp;
        if (this.getElement().equals(target)){
            return morseStr;
        }
        else if (this.getLeft() == null && this.getRight() == null){
            return "";
        }
        else{
            if (this.getLeft() != null && this.getLeft().isin(target) == true){
                morseStr = morseStr + "o";
                morseTrans(target, morseStr);
            }
            if (this.getRight() != null && this.getRight().isin(target) == true){
                morseStr = morseStr + "-";
                morseTrans(target, morseStr);
            }
        }
        morseStr = morseStr + " | ";
        return morseStr;
    }
    public String strTrans(String target){
        char end = ' ';
        int count = 0;
        morseTree(T tempNode);
        while (end != '|'){
            if (target[count] == o){
                tempNode = this.getLeft();
            }
        }
    }
}