package com.HIVFactsheet;


import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.CalendarContract;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import static android.R.id.message;

  public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public Dialog dialog;

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    long startMillis ;
    private MyWebChromeClient mWebChromeClient = null;
    private View mCustomView;
    private WebView myWebView ;
    private Boolean exit = false ;
    private RelativeLayout mContentView;
    private FrameLayout mCustomViewContainer;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);



     /**
      * The {@link ViewPager} that will host the section contents.
     */

     private ViewPager mViewPager;

//    private TextView but , video;

    FloatingActionButton fab, fab1, fab2, fab3, fab4;

    LinearLayout fabLayout1, fabLayout2, fabLayout3, fabLayout4;

    View fabBGLayout;

    boolean isFABOpen, shown=false;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0,0);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.op
        mViewPager = findViewById(R.id.container);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setOffscreenPageLimit(3);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
//        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
//        if (mViewPager != null)
//            mViewPager.setAdapter(pagerAdapter);
//            mTabLayout = findViewById(R.id.tabs);
//        if (mTabLayout != null) {
//            mTabLayout.setupWithViewPager(mViewPager);
//
//
//            for (int i = 0; i < mTabLayout.getTabCount(); i++) {
//                TabLayout.Tab tab = mTabLayout.getTabAt(i);
//                if (tab != null)
//
//                    tab.setCustomView(pagerAdapter.getTabView(i));
//            }
//
//            mTabLayout.getTabAt(0).getCustomView().setSelected(true);
//        }
        dialog = new Dialog(MainActivity.this, android.R.style.Theme );
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        LayoutInflater inflater = getLayoutInflater();
        @SuppressLint("InflateParams") View dialogview =  inflater.inflate(R.layout.homepage, null);
        dialog.setContentView(dialogview);
        dialog.setCancelable(false);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent event) {

                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    if (i == KeyEvent.KEYCODE_BACK) {
                        if (exit) {
                             finish();
                            // finish activity
                        }
                        else {
                            Toast.makeText(dialog.getContext(), "Press again to Exit.",
                                    Toast.LENGTH_SHORT).show();
                            exit = true;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    exit = false;
                                }
                            }, 3000);

                        }


                    }
                }
                return false;

            }
        });



        CardView mcardView = dialog.findViewById(R.id.card_view);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        mViewPager.setCurrentItem(0);
                        dialog.dismiss();
//                        new Handler().postDelayed(new Runnable() {
//                            @Override
//                            public void run() {
//
//                            }
//                        }, TIME_OUT);
//
                    }
                });
        mcardView = dialog.findViewById(R.id.card);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        mViewPager.setCurrentItem(1);
                        dialog.dismiss();
                    }
                });
        mcardView = dialog.findViewById(R.id.partners);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
//                        mViewPager.setCurrentItem(3);
                        startActivity(new Intent(MainActivity.this, you3.class));
                        dialog.dismiss();
                    }
                });
        mcardView = dialog.findViewById(R.id.AY);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mViewPager.setCurrentItem(3);
                        dialog.dismiss();
                    }
                });

        mcardView = dialog.findViewById(R.id.card_ucrs);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
//                        mViewPager.setCurrentItem(3);
                        startActivity(new Intent(MainActivity.this, PatientLitiracy.class));
                        dialog.dismiss();
                    }
                });
        Button mcarView = dialog.findViewById(R.id.button142);
        mcarView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(MainActivity.this, Main39Activity.class));
                    }
                });

        mcardView = dialog.findViewById(R.id.cardff);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        Uri.Builder builder = CalendarContract. CONTENT_URI.buildUpon();
                        builder . appendPath ("time");
                        ContentUris. appendId ( builder,startMillis );
                        Toast.makeText(MainActivity.this,"Appointment Reminder", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent ( Intent.ACTION_VIEW ).setData ( builder . build ());
                        startActivity (intent);
                    }
                });
        mcardView = dialog.findViewById(R.id.cardvv);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                        @Override
                        public void onClick (View v){
                            final Item[] items = {
                                    new Item("Make a call", R.drawable.ic_phone_black_24dp),
                                    new Item("Send Message", R.drawable.ic_textsms_black_24dp),
                                    new Item("Send Email", R.drawable.ic_mail_outline_black_24dp),//no icon for this one
                            };
                            ListAdapter adapter = new ArrayAdapter<Item>(MainActivity.this,
                                    android.R.layout.select_dialog_item,
                                    android.R.id.text1,
                                    items) {
                                @NonNull
                                public View getView(int position, View convertView, @NonNull ViewGroup parent) {
                                    //Use super class to create the View
                                    View v = super.getView(position, convertView, parent);
                                    TextView tv = (TextView) v.findViewById(android.R.id.text1);
                                    //Put the image on the TextView
                                    tv.setCompoundDrawablesWithIntrinsicBounds(items[position].icon, 0, 0, 0);
                                    //Add margin between image and text (support various screen densities)
                                    int dp5 = (int) (5 * getResources().getDisplayMetrics().density + 0.5f);
                                    tv.setCompoundDrawablePadding(dp5);
                                    tv.setTextColor(getResources().getColor(R.color.colorAccens));
                                    tv.setTextSize(14);

                                    return v;
                                }
                            };
                            new AlertDialog.Builder(MainActivity.this, R.style.MyTheme)
                                    .setTitle("\t\t\tTalk to a Counselor")
                                    .setCancelable(false)
                                    .setNegativeButton("Close",
                                    new DialogInterface.OnClickListener()
                                    {
                                        public void onClick(DialogInterface dialog, int id)
                                        {
                                            dialog.cancel();
                                        }
                                    })
                                    .setAdapter(adapter, new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int item) {
                                            //...
                                            // The 'which' argument contains the index position
                                            // of the selected item
                                            switch (item) {
                                                case 0:
                                                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                                    callIntent.setData(Uri.parse("tel:+254708376169"));
                                                    startActivity(callIntent);
                                                    break;

                                                case 1:
                                                    Uri uri = Uri.parse("smsto:+254708376169");
                                                    Intent it = new Intent(Intent.ACTION_SENDTO, uri);
                                                    startActivity(it);
                                                    break;
                                                case 2:
                                                    Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "hfactsheet@gmail.com", null));
                                                    intent.putExtra(Intent.EXTRA_TEXT, message);
                                                    startActivity(Intent.createChooser(intent, " Email Via :"));
                                                    break;
                                            }
                                        }

                                    }).create().show();
                        }
                    });

        myWebView = dialog.findViewById(R.id.webview);
        mWebChromeClient = new MainActivity.MyWebChromeClient();
        myWebView.setWebViewClient(new WebViewClient()
        {
            public void onPageFinished( WebView view, String url){

              }
        });
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setSupportMultipleWindows(true);
        webSettings.setGeolocationEnabled(true);
        myWebView.loadUrl("file:///android_asset/refers/about/bayo.html");
        dialog.show();
        fabLayout1= findViewById(R.id.fabLayout1);
        fabLayout2= findViewById(R.id.fabLayout2);
        fabLayout3= findViewById(R.id.fabLayout3);
        fabLayout4= findViewById(R.id.fabLayout4);
        fab1 = findViewById(R.id.fab1);
        fab2= findViewById(R.id.fab2);
        fab3 = findViewById(R.id.fab3);
        fab4 = findViewById(R.id.fab4);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+254711187569"));
                startActivity(callIntent);
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "hfactsheet@gmail.com", null));
                intent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(intent, " Email Us With :"));
            }
        });
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.facebook.com/HIVFactSheet"));
                MainActivity.this.startActivity(intent);
            }
        });
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://twitter.com/HIVFactSheet"));
                MainActivity.this.startActivity(intent);
            }
        });
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fabBGLayout=findViewById(R.id.fabBGLayout);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isFABOpen){
                    showFABMenu();
                    fabBGLayout.setVisibility(View.VISIBLE);
                }
                else{
                    closeFABMenu();
                }
            }
        });
        fabBGLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeFABMenu();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = findViewById(R.id.nav_view);
         navigationView.setNavigationItemSelectedListener(this);
    }
    private void showFABMenu(){
        isFABOpen=true;
        fabLayout1.setVisibility(View.VISIBLE);
        fabLayout2.setVisibility(View.VISIBLE);
        fabLayout3.setVisibility(View.VISIBLE);
        fabLayout4.setVisibility(View.VISIBLE);
        fabBGLayout.setVisibility(View.VISIBLE);
        fab.animate().rotationBy(180);
        fabLayout1.animate().translationY(-getResources().getDimension(R.dimen.standard_55));
        fabLayout2.animate().translationY(-getResources().getDimension(R.dimen.standard_100));
        fabLayout3.animate().translationY(-getResources().getDimension(R.dimen.standard_145));
        fabLayout4.animate().translationY(-getResources().getDimension(R.dimen.standard_190));
    }
    private void closeFABMenu(){
        isFABOpen=false;
        fabBGLayout.setVisibility(View.GONE);
        fab.animate().rotationBy(-180);
        fabLayout1.animate().translationY(0);
        fabLayout2.animate().translationY(0);
        fabLayout3.animate().translationY(0);
        fabLayout4.animate().translationY(0).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {}

            @Override
            public void onAnimationEnd(Animator animator) {
                if(!isFABOpen){
                    fabLayout1.setVisibility(View.GONE);
                    fabLayout2.setVisibility(View.GONE);
                    fabLayout3.setVisibility(View.GONE);
                    fabLayout4.setVisibility(View.GONE);
                } }
            @Override
            public void onAnimationCancel(Animator animator) {}
            @Override
            public void onAnimationRepeat(Animator animator) {}
        });
    }
    public class MyWebChromeClient extends WebChromeClient {

        FrameLayout.LayoutParams LayoutParameters = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);

        @Override
        public void onShowCustomView(View view, CustomViewCallback callback) {
            // if a view already exists then immediately terminate the new one
            if (mCustomView != null) {
                callback.onCustomViewHidden();
                return;
            }
            mContentView = findViewById(R.id.activity_main21);
            mContentView.setVisibility(View.GONE);
            mCustomViewContainer = new FrameLayout(MainActivity.this);
            mCustomViewContainer.setLayoutParams(LayoutParameters);
            mCustomViewContainer.setBackgroundResource(android.R.color.black);
            view.setLayoutParams(LayoutParameters);
            mCustomViewContainer.addView(view);
            mCustomView = view;
            mCustomViewCallback = callback;
            mCustomViewContainer.setVisibility(View.VISIBLE);
            setContentView(mCustomViewContainer);
        }

        @Override
        public void onHideCustomView() {
            if (mCustomView == null) {
                return;
            } else {
                // Hide the custom view.
                mCustomView.setVisibility(View.GONE);
                // Remove the custom view from its container.
                mCustomViewContainer.removeView(mCustomView);
                mCustomView = null;
                mCustomViewContainer.setVisibility(View.GONE);
                mCustomViewCallback.onCustomViewHidden();
                // Show the content view.
                mContentView.setVisibility(View.VISIBLE);
                setContentView(mContentView);
            }
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
              drawer.closeDrawer(GravityCompat.START);
        }
        else if (isFABOpen){
            closeFABMenu();
        }
        else {

            dialog.show();
        }




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        // Lofcate MenuItem with ShareActionProvider
        MenuItem item = menu.findItem(R.id.action_share);
        // Fetch and store ShareActionProvider
        ShareActionProvider mShareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(item);
        mShareActionProvider.setShareHistoryFileName(ShareActionProvider.DEFAULT_SHARE_HISTORY_FILE_NAME);
        // Set share Intent.
        // Note: You can set the share Intent afterwords if you don't want to set it right now.
        mShareActionProvider.setShareIntent(createShareIntent());

        // Return true to display menu
        return true;
    }

    // Create and return the Share Intent
    private Intent createShareIntent() {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "HIVFactSheet\n\n" +
                "Receive updated Comprehensive HIV and Reproductive Health in addition of communicating with a Health Counselor.\n" +

                "https://play.google.com/store/apps/details?id=com.HIVFactsheet");
        Intent intent = Intent.createChooser(shareIntent,"Share Via");
        return shareIntent;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_help) {
            dialog.show();

//            startActivity(new Intent(MainActivity.this, help.class));

        }
        if (id == R.id.nav) {

            Uri.Builder builder = CalendarContract. CONTENT_URI.buildUpon();
            builder . appendPath ("time");
            ContentUris. appendId ( builder,startMillis );
            Toast.makeText(MainActivity.this,"Appointment Reminder", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent ( Intent.ACTION_VIEW ).setData ( builder . build ());
            startActivity (intent);
        }
        else if (id == R.id.action_about){
            startActivity(new Intent(MainActivity.this, AboutActivity.class));

        }

        else if (id == R.id.nav_twitter){
            Intent intent = new Intent( Intent.ACTION_SENDTO, Uri .fromParts("mailto","hfactsheet@gmail.com" , null ));
            intent.putExtra( Intent.EXTRA_TEXT, message);
            startActivity( Intent.createChooser(intent, " Email Via :" ));

        }
        else if (id == R.id.call){
            Intent callIntent = new Intent ( Intent.ACTION_DIAL);
            callIntent.setData( Uri .parse( "tel:+254708376169"));
            startActivity(callIntent);
        }
        else if (id == R.id.nav_facebook){
            Uri uri = Uri .parse( "smsto:+254708376169" );
            Intent it = new Intent ( Intent .ACTION_SENDTO, uri);
            startActivity(it);
        }
        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_camera) {
            startActivity(new Intent(MainActivity.this, Main43Activity.class));
            // Handle the camera action
        }
//        else if (id == R.id.nav_slideshow) {
//            startActivity(new Intent(MainActivity.this, Main42Activity.class));
//        }
        else if (id == R.id.nav_home){
            dialog.show();
        }
        else if (id == R.id.vl){
            new AlertDialog.Builder(MainActivity.this).setMessage(Html.fromHtml("Want to view in <font color = '#000000'> your computer browser </font>for clarity??? Here is the link \n\n <font color = '#3572af'>\t https://viralload.nascop.org/</font>"))
                    .setPositiveButton(Html.fromHtml("<font color = '#118626'>Just continue>></font> "), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(MainActivity.this, videos.class));
                        }
                    }).show();
        }
        else if (id == R.id.nav_call) {
            startActivity(new Intent(MainActivity.this, AboutActivity.class));
        }
        else if (id == R.id.nav_manage) {
            startActivity(new Intent(MainActivity.this, Main39Activity.class));
        }
         else if (id == R.id.ampath){
            startActivity(new Intent(MainActivity.this, ampath.class));

        } else if (id == R.id.nav_share) {
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBody = "Receive updated Comprehensive HIV and Reproductive Health in addition of communicating with a Health Counselor.\n" +
                    "https://play.google.com/store/apps/details?id=com.HIVFactsheet";
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share Via"));
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
       }
    public class SectionsPagerAdapter extends FragmentPagerAdapter{
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            switch (position) {

                case 0:
                    return new you();
                case 1:
                    return new you10();
                case 2:
                    return new you6();
                case 3:
                    return new partners();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 4;
        }
        @Override
        public CharSequence getPageTitle(int position)
        {

            switch (position)
            {

                case 0:
                    return "Facts About HIV";
                case 1:
                    return "RH";
                case 2:
                    return "Find a Health Center";
                case 3:
                    return "Youth Initiatives";

            }
            return null;
        }


    }
}
