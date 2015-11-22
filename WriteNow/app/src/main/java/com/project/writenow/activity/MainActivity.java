package com.project.writenow.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.project.writenow.R;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeader;


public class MainActivity extends AppCompatActivity {
    private static final int PROFILE_SETTING = 1;
    private Drawer.Result drawer;
    private AccountHeader headerResult = null;
    private static final int DRAWER_ITEM_OPEN_SOURCE = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Create a few sample profile
        // NOTE you have to define the loader logic too. See the CustomApplication for more details
//        final IProfile profile = new ProfileDrawerItem().withName("Mike Penz").withEmail("mikepenz@gmail.com").withIcon("https://avatars3.githubusercontent.com/u/1476232?v=3&s=460").withIdentifier(100);
//        final IProfile profile2 = new ProfileDrawerItem().withName("Bernat Borras").withEmail("alorma@github.com").withIcon(Uri.parse("https://avatars3.githubusercontent.com/u/887462?v=3&s=460")).withIdentifier(101);
//        final IProfile profile3 = new ProfileDrawerItem().withName("Max Muster").withEmail("max.mustermann@gmail.com").withIcon(R.drawable.profile2).withIdentifier(102);
//        final IProfile profile4 = new ProfileDrawerItem().withName("Felix House").withEmail("felix.house@gmail.com").withIcon(R.drawable.profile3).withIdentifier(103);
//        final IProfile profile5 = new ProfileDrawerItem().withName("Mr. X").withEmail("mister.x.super@gmail.com").withIcon(R.drawable.profile4).withIdentifier(104);
//        final IProfile profile6 = new ProfileDrawerItem().withName("Batman").withEmail("batman@gmail.com").withIcon(R.drawable.profile5).withIdentifier(105);
//
//        // Create the AccountHeader
//        headerResult = new AccountHeaderBuilder()
//                .withActivity(this)
//                .withHeaderBackground(R.drawable.header)
//                .addProfiles(
//                        profile,
//                        profile2,
//                        profile3,
//                        profile4,
//                        profile5,
//                        profile6,
//                        //don't ask but google uses 14dp for the add account icon in gmail but 20dp for the normal icons (like manage account)
//                        new ProfileSettingDrawerItem().withName("Add Account").withDescription("Add new GitHub Account").withIcon(new IconicsDrawable(this, GoogleMaterial.Icon.gmd_add).actionBar().paddingDp(5).colorRes(R.color.material_drawer_primary_text)).withIdentifier(PROFILE_SETTING),
//                        new ProfileSettingDrawerItem().withName("Manage Account").withIcon(GoogleMaterial.Icon.gmd_settings)
//                )
//                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
//                    @Override
//                    public boolean onProfileChanged(View view, IProfile profile, boolean current) {
//                        //sample usage of the onProfileChanged listener
//                        //if the clicked item has the identifier 1 add a new profile ;)
//                        if (profile instanceof IDrawerItem && ((IDrawerItem) profile).getIdentifier() == PROFILE_SETTING) {
//                            int count = 100 + headerResult.getProfiles().size() + 1;
//                            IProfile newProfile = new ProfileDrawerItem().withNameShown(true).withName("Batman" + count).withEmail("batman" + count + "@gmail.com").withIcon(R.drawable.profile5).withIdentifier(count);
//                            if (headerResult.getProfiles() != null) {
//                                //we know that there are 2 setting elements. set the new profile above them ;)
//                                headerResult.addProfile(newProfile, headerResult.getProfiles().size() - 2);
//                            } else {
//                                headerResult.addProfiles(newProfile);
//                            }
//                        }
//
//                        //false if you have not consumed the event and it should close the drawer
//                        return false;
//                    }
//                })
//                .withSavedInstance(savedInstanceState)
//                .build();

//        final SharedPreferences pref = getSharedPreferences("com.mikepenz.applicationreader", 0);
//
//        drawer = new Drawer(this)
//                .withToolbar(toolbar)
//                .addDrawerItems(
//                        new SwitchDrawerItem().withOnCheckedChangeListener(new OnCheckedChangeListener() {
//                            @Override
//                            public void onCheckedChanged(IDrawerItem drawerItem, CompoundButton compoundButton, boolean b) {
//                                SharedPreferences.Editor editor = pref.edit();
//                                editor.putBoolean("autouploadenabled", b);
//                                editor.apply();
//                            }
//                        }).withName(R.string.drawer_switch).withChecked(pref.getBoolean("autouploadenabled", false))
//
//                ).addStickyDrawerItems(
//                        new SecondaryDrawerItem()
//                                .withName(R.string.drawer_opensource)
//                                .withIdentifier(DRAWER_ITEM_OPEN_SOURCE)
//                                .withIcon(FontAwesome.Icon.faw_github)
//                                .withCheckable(false)
//                )
//                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l, IDrawerItem drawerItem) {
//                        if (drawerItem.getIdentifier() == DRAWER_ITEM_OPEN_SOURCE) {
//                            new Libs.Builder()
//                                    .withFields(R.string.class.getFields())
//                                    .withVersionShown(true)
//                                    .withLicenseShown(true)
//                                    .withActivityTitle(getString(R.string.drawer_opensource))
//                                    .withActivityStyle(Libs.ActivityStyle.LIGHT_DARK_TOOLBAR)
//                                    .start(MainActivity.this);
//                        }
//                    }
//                })
//                .withSelectedItem(-1)
//                .withSavedInstance(savedInstanceState)
//                .build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
