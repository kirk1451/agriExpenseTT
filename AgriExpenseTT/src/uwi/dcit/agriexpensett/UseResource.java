package uwi.dcit.agriexpensett;

import helper.DHelper;
import helper.DbHelper;
import helper.DbQuery;

import java.util.ArrayList;

import com.example.agriexpensett.R;
import com.example.agriexpensett.rpurchaseendpoint.model.RPurchase;

import fragments.ChoosePurchase;
import fragments.FragmentEmpty;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class UseResource extends ActionBarActivity {
	Double total;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle data=this.getIntent().getExtras();
		Bundle b=data.getParcelable("cyc");
		localCycle c=b.getParcelable("cyc");
		String s=getIntent().getStringExtra("type");
		System.out.println("type before:"+s);
		String tS=getIntent().getStringExtra("total");
		total=Double.parseDouble(tS);
		setContentView(R.layout.activity_use_resource);
		start(c,s);
			
	}
	
	private void start(localCycle c, String s) {
		DbHelper dbh=new DbHelper(this);
		SQLiteDatabase db=dbh.getReadableDatabase();
		ArrayList<localResourcePurchase> pList=new ArrayList<localResourcePurchase>();
		DbQuery.getPurchases(db, dbh, pList, s, null);
		db.close();
		if(pList.isEmpty()){
			//View view=getLayoutInflater().inflate(R.layout.fragment_empty_purchaselist, R.id.useExpenseFrag);
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			Fragment f=new FragmentEmpty();
			Bundle b=new Bundle();
			b.putString("type","purchase");
			b.putString("category", s);
			f.setArguments(b);
			ft.add(R.id.useExpenseFrag, f);
			ft.commit();
		}else{
		// TODO Auto-generated method stub
			initialFrag(c,s);
		}
	}

	public double getTotal(){
		return total;
	}
	
	private void initialFrag(localCycle c,String s) {
		Bundle pass=new Bundle();
		pass.putParcelable("cycle",c);
		pass.putString("det",s);
		FragmentManager fm=getFragmentManager();
		FragmentTransaction ft=fm.beginTransaction();
		ListFragment listfrag=new ChoosePurchase();
		listfrag.setArguments(pass);
		ft.add(R.id.useExpenseFrag,listfrag);
		ft.commit();
		
		View line=findViewById(R.id.line_header_useRes);
		//line.setBackgroundColor(Color.parseColor("#80000000"));
		//line.getBackground().setAlpha(50);
		String category=getIntent().getStringExtra("type");
		if(category.equals(DHelper.cat_plantingMaterial)){
			line.setBackgroundResource(R.color.colourPM);
		}else if(category.equals(DHelper.cat_fertilizer)){
			line.setBackgroundResource(R.color.colourFer);
		}else if(category.equals(DHelper.cat_soilAmendment)){
			line.setBackgroundResource(R.color.colourSoil);
		}else if(category.equals(DHelper.cat_chemical)){
			line.setBackgroundResource(R.color.colourChem);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.use_resource, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */

}
