package DAY5.com.tnsif.dayfive.multilevelinheritance.texteditor;

public class Word {

	
		// TODO Auto-generated method stub
		//Program to define child class Word with advance feature
		
		    private boolean spellCheckEnabled;

		    public Word() {
		        super();
		        this.spellCheckEnabled = true;
		    }

		    public void spellCheck() {
		        if (spellCheckEnabled) {
		            System.out.println("Running spell check...");
		            // Simulate spell check logic here
		        } else {
		            System.out.println("Spell check is disabled.");
		        }
		    }

		    public void enableSpellCheck(boolean enable) {
		        spellCheckEnabled = enable;
		    }

			public void write(String string) {
				// TODO Auto-generated method stub
				
			}

			public void formatText(boolean b) {
				// TODO Auto-generated method stub
				
			}

			public void displayContent() {
				// TODO Auto-generated method stub
				
			}

			public String isBold() {
				// TODO Auto-generated method stub
				return null;
			}
		
	}


