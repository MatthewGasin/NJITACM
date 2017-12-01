package org.acm.njit.njitacm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {
    Button contactP, contactVP, contactPR, slack, discord, office;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_tutoring:
                    return nextFragment(new TutoringFragment());
                case R.id.navigation_sigs:
                    return nextFragment(new SIGFragment());
                case R.id.navigation_home:
                    return nextFragment(new HomeFragment());
                case R.id.navigation_social_media:
                    return nextFragment(new SocialMediaFragment());
                case R.id.navigation_contact_us:
                    return nextFragment(new ContactUsFragment());
            }

            return false;
        }
    };


    private boolean nextFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        // Create a new Fragment to be placed in the activity layout
        HomeFragment firstFragment = new HomeFragment();

        // Add the fragment to the 'fragment_container' FrameLayout
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, firstFragment).commit();


        navigation.setSelectedItemId(R.id.navigation_home);

        contactP = (Button) findViewById(R.id.contactP);
        contactVP = (Button) findViewById(R.id.contactVP);
        contactPR = (Button) findViewById(R.id.contactPR);
        slack = (Button) findViewById(R.id.slack);
        discord = (Button) findViewById(R.id.discord);
        office = (Button) findViewById(R.id.office);
    }

    public void onClickPresident(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        String email = "djb68@gmail.com";
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
        emailIntent.setType("plain/text");
        startActivity(Intent.createChooser(emailIntent, "Choose Email App"));
    }

    public void onClickVicePresident(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        String email = "mg427@gmail.com";
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
        emailIntent.setType("plain/text");
        startActivity(Intent.createChooser(emailIntent, "Choose Email App"));
    }

    public void onClickPublicRelations(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        String email = "ms2286@gmail.com";
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
        emailIntent.setType("plain/text");
        startActivity(Intent.createChooser(emailIntent, "Choose Email App"));
    }

    public void onClickSlack(View view) {
        // Perform action on click
        String url = "https://njit-acm.slack.com/signup";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void onClickDiscord(View view) {
        // Perform action on click
        String url = "https://discord.gg/qtbyg8P";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void onClickOffice(View view) {
        Context context = getApplicationContext();
        CharSequence text = "973-596-2861";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
