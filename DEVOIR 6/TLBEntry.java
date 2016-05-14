/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir6;

/**
 *
 * @author Fainaru
 */
public class TLBEntry {
    
    private int pageNumber;		// the virtual page number
	private int frameNumber;	// the physical frame number
	private boolean isValid;	// flag that indicates if the mapping
					// is valid.

	public TLBEntry() {
		pageNumber = -1;
		frameNumber = -1;
		isValid = false;
	}

	public boolean setMapping(int pageNumber, int frameNumber) {
		this.pageNumber = pageNumber;
		this.frameNumber = frameNumber;
		isValid = true;

		return isValid;
	}	

	public boolean checkPageNumber(int pageNumber) {
		if (pageNumber == this.pageNumber)
			return true;
		else
			return false;
	}

	public int getFrameNumber() {
		return frameNumber;
	}
    
    
    
    
    
}
