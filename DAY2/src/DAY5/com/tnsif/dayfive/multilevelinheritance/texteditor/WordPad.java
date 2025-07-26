package DAY5.com.tnsif.dayfive.multilevelinheritance.texteditor;

public class WordPad extends Notepad {

	
		// TODO Auto-generated method stub
		//Program to define child class Wordpad with formatting text feature
		
		    private boolean isBold;

		    public void Wordpad() {
		        
		        this.isBold = false;
		    }

		    public void formatText(boolean bold) {
		        if (bold) {
		            content = "<b>" + content + "</b>";
		        }
		        isBold = bold;
		    }

		    public boolean isBold() {
		        return isBold;
		    }
		
	}

