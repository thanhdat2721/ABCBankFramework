package asd.bank.view;

import asd.abcbankframework.DialogFactory.FormDialog;
import asd.abcbankframework.View.CenterPanelComponent;
import asd.abcbankframework.View.MainView;
import asd.abcbankframework.View.RightPanelComponent;
import asd.abcbankframework.View.TopPanelComponent;
import asd.abcbankframework.controller.MainController;

import java.awt.*;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/**
 * A basic JFC based application.
 **/
public class BankFrm extends MainView
{
    /****
     * init variables in the object
     ****/


    BankController bankController;

    
	public BankFrm(OwnHeaderComponent topPanelComponent,CenterPanelComponent centerPanelComponent,RightPanelComponent rightPanelComponent, MainController controller)
	{
		super(centerPanelComponent,rightPanelComponent,topPanelComponent, controller);
		topPanelComponent.setJButton_AddInterest(new AddInterest());
		bankController = new BankController();
		setTitle("Bank");
	    rightPanelComponent.setJButton_WithdrawAction(withdraw);
	}
	class AddInterest implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			JButtonInterest_actionPerformed(event);

		}
	}

	void JButtonInterest_actionPerformed(java.awt.event.ActionEvent event)
	{
		InterestDialog interestDialog  = new InterestDialog(this);
		interestDialog.setBodyCancelAction(new CancelCreateAccountPer(interestDialog));
		interestDialog.setBodyOKAction(new OKCreateAccountPer(interestDialog));
		interestDialog.show();
	}
	class OKCreateAccountPer implements java.awt.event.ActionListener
	{
		InterestDialog interestDialog;
		public OKCreateAccountPer(InterestDialog interestDialog){
			this.interestDialog = interestDialog;
		}
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			bankController.addInterest(Double.parseDouble(interestDialog.getInterest()));
			
			
			centerPanelComponent.setTableModel(new BankDataModel(bankController.getDataVector(), bankController.getColumnIdentifiers()));
            Vector<Vector<String>> data = bankController.getDataVector();                       
 			
			refreshTable(new BankDataModel(data, bankController.getColumnIdentifiers()));
			interestDialog.dispose();
		}
	}

	class CancelCreateAccountPer implements java.awt.event.ActionListener
	{
		InterestDialog interestDialog;
		public CancelCreateAccountPer(InterestDialog interestDialog){
			this.interestDialog = interestDialog;
		}
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			interestDialog.dispose();
		}
	}


	/*****************************************************
	 * The entry point for this application.
	 * Sets the Look and Feel to the System Look and Feel.
	 * Creates a new JFrame1 and makes it visible.
	 *****************************************************/
}


