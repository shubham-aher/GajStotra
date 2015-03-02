/*
 * GajStotra v1.0 - An app that allows you to read, understand and recite Gaj/Gajanan/Ganesh  Stotras.
 * Author: Shubham .S. Aher
 * Nasik/Pune,
 * Maharashatra,
 * INDIA.
 * Email: shubham.aher.2011@gmail.com
 * Mob: +91.7709553117
 * Created For: IADC 2011
 */
package shubham.aher.gajstotra;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class GajStotra extends Activity {
	
	//Menu Items Order
	private static final int MENUITEM_STOTRAS=Menu.FIRST;
	private static final int MENUITEM_ABT=Menu.FIRST+1;
	private static final int MENUITEM_EXIT=Menu.FIRST+2;
	
	//Stotra display's PICTURE,TEXT & STORY.
	ImageView imgvwStotraPic;
	TextView tvStotraTxt;
	TextView tvStotraStory;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Get all UI Components from XML
        imgvwStotraPic=(ImageView)findViewById(R.id.imgvw_stotra_pic);
        tvStotraTxt=(TextView)findViewById(R.id.tv_stotra_txt);
        tvStotraStory=(TextView)findViewById(R.id.tv_stotra_story);
        
        //Assign colors to texts & stories
        tvStotraTxt.setTextColor(Color.CYAN);
        tvStotraStory.setTextColor(Color.RED);
        
        //Load default stotra pics & text
        imgvwStotraPic.setImageResource(R.drawable.stotra1);
        tvStotraTxt.setText(R.string.stotra_texts_0);
        tvStotraStory.setText(R.string.stotra_story_0);
        
        //Show start toast msg...
        showSplashToast();
    }
    
    public void showSplashToast()
    {
    	Toast.makeText(this,R.string.splash_toast,Toast.LENGTH_LONG).show();
    }
    
    public boolean onCreateOptionsMenu(Menu menu)
    {
    	menu.add(0,MENUITEM_STOTRAS,0,R.string.menuitem_stotras).setIcon(R.drawable.stotraico);
    	menu.add(0,MENUITEM_ABT,0,R.string.menuitem_abt).setIcon(R.drawable.abt);
    	menu.add(0,MENUITEM_EXIT,0,R.string.menuitem_exit).setIcon(R.drawable.exit);
    	
    	return super.onCreateOptionsMenu(menu);
    }
    
    public boolean onOptionsItemSelected(MenuItem item)
    {
    	switch(item.getItemId())
    	{
    		case MENUITEM_STOTRAS:  
    								final CharSequence stotraList[]={
    																"Stotra 1",
    																"Stotra 2",
    																"Stotra 3",
    																"Stotra 4",
    																"Stotra 5",
    																"Stotra 6",
    																"Stotra 7",
    																"Stotra 8",
    																};
    								
    								AlertDialog.Builder dlgStotras=new AlertDialog.Builder(this);
    								dlgStotras.setTitle(R.string.dlg_stotras_title);
    								dlgStotras.setIcon(R.drawable.stotraico);
    								
    								dlgStotras.setItems(stotraList,new DialogInterface.OnClickListener() {
										
										@Override
										public void onClick(DialogInterface dialog, int selectedStotra) {
											// TODO Auto-generated method stub
											
											switch(selectedStotra)
											{
												case 0:
														imgvwStotraPic.setImageResource(R.drawable.stotra1);
														tvStotraTxt.setText(R.string.stotra_texts_0);
														tvStotraStory.setText(R.string.stotra_story_0);
														break;
											
												case 1:
														imgvwStotraPic.setImageResource(R.drawable.stotra2);
														tvStotraTxt.setText(R.string.stotra_texts_1);
														tvStotraStory.setText(R.string.stotra_story_1);
														break;
														
												case 2:
														imgvwStotraPic.setImageResource(R.drawable.stotra3);
														tvStotraTxt.setText(R.string.stotra_texts_2);
														tvStotraStory.setText(R.string.stotra_story_2);
														break;	
													
												case 3:
														imgvwStotraPic.setImageResource(R.drawable.stotra4);
														tvStotraTxt.setText(R.string.stotra_texts_3);
														tvStotraStory.setText(R.string.stotra_story_3);
														break;
													
												case 4:
														imgvwStotraPic.setImageResource(R.drawable.stotra5);
														tvStotraTxt.setText(R.string.stotra_texts_4);
														tvStotraStory.setText(R.string.stotra_story_4);
														break;
													
												case 5:
														imgvwStotraPic.setImageResource(R.drawable.stotra6);
														tvStotraTxt.setText(R.string.stotra_texts_5);
														tvStotraStory.setText(R.string.stotra_story_5);
														break;
													
												case 6:
														imgvwStotraPic.setImageResource(R.drawable.stotra7);
														tvStotraTxt.setText(R.string.stotra_texts_6);
														tvStotraStory.setText(R.string.stotra_story_6);
														break;
													
												case 7:
														imgvwStotraPic.setImageResource(R.drawable.stotra8);
														tvStotraTxt.setText(R.string.stotra_texts_7);
														tvStotraStory.setText(R.string.stotra_story_7);
														break;
											}
										}
									});
    								
    								AlertDialog adlgStotras=dlgStotras.create();
    								adlgStotras.show();
    									
    								break;
    							
    		case MENUITEM_ABT:
    								AlertDialog.Builder dlgAbout=new AlertDialog.Builder(this);
    								dlgAbout.setMessage(R.string.dlg_abt_txt);
    								dlgAbout.setTitle(R.string.dlg_abt_title);
    								dlgAbout.setIcon(R.drawable.icon);
    								
    								dlgAbout.setNeutralButton("OK",new DialogInterface.OnClickListener() {
										
										@Override
										public void onClick(DialogInterface dialog, int which) {
											// TODO Auto-generated method stub
											//Do nothing as neutral OK button is pressed
										}
									});
    								
    								dlgAbout.show();
    								
    								break;
    							
    		case MENUITEM_EXIT:		
    								//Activity finished, release resources.
    								this.finish();
    								break;
    	}
    	
    	return super.onOptionsItemSelected(item);
    }
    
}