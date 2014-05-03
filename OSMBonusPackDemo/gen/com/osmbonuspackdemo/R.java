/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.osmbonuspackdemo;

public final class R {
    public static final class array {
        /**  39 
         */
        public static final int direction_icons=0x7f080000;
        /**   
		  Nominatim keywords that can be used for facility search. 
		  Note that Nominatim facility search uses Special Phrases instead of OSM tags. 
		  See http://wiki.openstreetmap.org/wiki/Nominatim/Special_Phrases
		  and http://wiki.openstreetmap.org/wiki/Nominatim/Special_Phrases/EN
		  In comment, keywords with no significant result for Paris area on 8/04/2013
		
 
		  For OSM tags, see http://wiki.openstreetmap.org/wiki/Map_Features
		  But, again, note that keywords for Nominatim are not the OSM features. 
		
  
	  Nominatim keywords that can be used for facility search in French. 
	  See http://wiki.openstreetmap.org/wiki/Nominatim/Special_Phrases/FR
	  In comment, keywords with no significant result on 11/04/2013. 
	
         */
        public static final int poi_tags=0x7f080001;
    }
    public static final class attr {
        /** 
    The size of the ad. It must be one of BANNER, FULL_BANNER, LEADERBOARD,
    MEDIUM_RECTANGLE, SMART_BANNER, WIDE_SKYSCRAPER, or
    &lt;width&gt;x&lt;height&gt;.
    
         <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int adSize=0x7f010000;
        /** 
    A comma-separated list of the supported ad sizes. The sizes must be one of
    BANNER, FULL_BANNER, LEADERBOARD, MEDIUM_RECTANGLE, SMART_BANNER,
    WIDE_SKYSCRAPER, or &lt;width&gt;x&lt;height&gt;.
    
         <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int adSizes=0x7f010001;
        /**  The ad unit ID. 
         <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int adUnitId=0x7f010002;
        /** <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int cameraBearing=0x7f010004;
        /** <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int cameraTargetLat=0x7f010005;
        /** <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int cameraTargetLng=0x7f010006;
        /** <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int cameraTilt=0x7f010007;
        /** <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int cameraZoom=0x7f010008;
        /** <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>none</code></td><td>0</td><td></td></tr>
<tr><td><code>normal</code></td><td>1</td><td></td></tr>
<tr><td><code>satellite</code></td><td>2</td><td></td></tr>
<tr><td><code>terrain</code></td><td>3</td><td></td></tr>
<tr><td><code>hybrid</code></td><td>4</td><td></td></tr>
</table>
         */
        public static final int mapType=0x7f010003;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int uiCompass=0x7f010009;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int uiRotateGestures=0x7f01000a;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int uiScrollGestures=0x7f01000b;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int uiTiltGestures=0x7f01000c;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int uiZoomControls=0x7f01000d;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int uiZoomGestures=0x7f01000e;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int useViewLifecycle=0x7f01000f;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int zOrderOnTop=0x7f010010;
    }
    public static final class color {
        public static final int common_action_bar_splitter=0x7f040009;
        /**  Sign-in Button Colors 
         */
        public static final int common_signin_btn_dark_text_default=0x7f040000;
        public static final int common_signin_btn_dark_text_disabled=0x7f040002;
        public static final int common_signin_btn_dark_text_focused=0x7f040003;
        public static final int common_signin_btn_dark_text_pressed=0x7f040001;
        public static final int common_signin_btn_default_background=0x7f040008;
        public static final int common_signin_btn_light_text_default=0x7f040004;
        public static final int common_signin_btn_light_text_disabled=0x7f040006;
        public static final int common_signin_btn_light_text_focused=0x7f040007;
        public static final int common_signin_btn_light_text_pressed=0x7f040005;
        public static final int common_signin_btn_text_dark=0x7f04000a;
        public static final int common_signin_btn_text_light=0x7f04000b;
    }
    public static final class drawable {
        public static final int bonuspack_bubble=0x7f020000;
        public static final int bonuspack_bubble_black=0x7f020001;
        public static final int btn_delete=0x7f020002;
        public static final int btn_moreinfo=0x7f020003;
        public static final int btn_route=0x7f020004;
        public static final int btn_tracking_off=0x7f020005;
        public static final int btn_tracking_on=0x7f020006;
        public static final int common_signin_btn_icon_dark=0x7f020007;
        public static final int common_signin_btn_icon_disabled_dark=0x7f020008;
        public static final int common_signin_btn_icon_disabled_focus_dark=0x7f020009;
        public static final int common_signin_btn_icon_disabled_focus_light=0x7f02000a;
        public static final int common_signin_btn_icon_disabled_light=0x7f02000b;
        public static final int common_signin_btn_icon_focus_dark=0x7f02000c;
        public static final int common_signin_btn_icon_focus_light=0x7f02000d;
        public static final int common_signin_btn_icon_light=0x7f02000e;
        public static final int common_signin_btn_icon_normal_dark=0x7f02000f;
        public static final int common_signin_btn_icon_normal_light=0x7f020010;
        public static final int common_signin_btn_icon_pressed_dark=0x7f020011;
        public static final int common_signin_btn_icon_pressed_light=0x7f020012;
        public static final int common_signin_btn_text_dark=0x7f020013;
        public static final int common_signin_btn_text_disabled_dark=0x7f020014;
        public static final int common_signin_btn_text_disabled_focus_dark=0x7f020015;
        public static final int common_signin_btn_text_disabled_focus_light=0x7f020016;
        public static final int common_signin_btn_text_disabled_light=0x7f020017;
        public static final int common_signin_btn_text_focus_dark=0x7f020018;
        public static final int common_signin_btn_text_focus_light=0x7f020019;
        public static final int common_signin_btn_text_light=0x7f02001a;
        public static final int common_signin_btn_text_normal_dark=0x7f02001b;
        public static final int common_signin_btn_text_normal_light=0x7f02001c;
        public static final int common_signin_btn_text_pressed_dark=0x7f02001d;
        public static final int common_signin_btn_text_pressed_light=0x7f02001e;
        public static final int delete=0x7f02001f;
        public static final int delete_pressed=0x7f020020;
        public static final int expander_bgrnd=0x7f020021;
        public static final int ic_arrived=0x7f020022;
        public static final int ic_continue=0x7f020023;
        public static final int ic_empty=0x7f020024;
        public static final int ic_menu_itinerary=0x7f020025;
        public static final int ic_menu_poi=0x7f020026;
        public static final int ic_plusone_medium_off_client=0x7f020027;
        public static final int ic_plusone_small_off_client=0x7f020028;
        public static final int ic_plusone_standard_off_client=0x7f020029;
        public static final int ic_plusone_tall_off_client=0x7f02002a;
        public static final int ic_roundabout=0x7f02002b;
        public static final int ic_sharp_left=0x7f02002c;
        public static final int ic_sharp_right=0x7f02002d;
        public static final int ic_slight_left=0x7f02002e;
        public static final int ic_slight_right=0x7f02002f;
        public static final int ic_turn_left=0x7f020030;
        public static final int ic_turn_right=0x7f020031;
        public static final int ic_u_turn=0x7f020032;
        public static final int icon=0x7f020033;
        public static final int kml_icon_groundoverlay=0x7f020034;
        public static final int kml_icon_linestring=0x7f020035;
        public static final int kml_icon_multigeometry=0x7f020036;
        public static final int kml_icon_polygon=0x7f020037;
        public static final int marker_cluster=0x7f020038;
        public static final int marker_departure=0x7f020039;
        public static final int marker_destination=0x7f02003a;
        public static final int marker_kml_point=0x7f02003b;
        public static final int marker_node=0x7f02003c;
        public static final int marker_poi=0x7f02003d;
        public static final int marker_poi_cluster=0x7f02003e;
        public static final int marker_poi_default=0x7f02003f;
        public static final int marker_poi_flickr=0x7f020040;
        public static final int marker_poi_picasa_24=0x7f020041;
        public static final int marker_poi_wikipedia_16=0x7f020042;
        public static final int marker_poi_wikipedia_32=0x7f020043;
        public static final int marker_via=0x7f020044;
        public static final int moreinfo_arrow=0x7f020045;
        public static final int moreinfo_arrow_pressed=0x7f020046;
    }
    public static final class id {
        public static final int btnOK=0x7f050019;
        public static final int bubble_delete=0x7f05000e;
        public static final int bubble_description=0x7f050008;
        public static final int bubble_image=0x7f050005;
        public static final int bubble_moreinfo=0x7f050007;
        public static final int bubble_subdescription=0x7f050009;
        public static final int bubble_title=0x7f050006;
        public static final int buttonSearchDep=0x7f05001e;
        public static final int buttonSearchDest=0x7f050020;
        public static final int buttonTrackingMode=0x7f050025;
        public static final int checkbox_visible=0x7f050018;
        public static final int description=0x7f050013;
        public static final int details=0x7f05000c;
        public static final int editDeparture=0x7f05001d;
        public static final int editDestination=0x7f05001f;
        public static final int expander=0x7f050021;
        public static final int fillColor=0x7f050017;
        public static final int fillColorLayout=0x7f050016;
        public static final int focusPicker=0x7f050011;
        public static final int hybrid=0x7f050004;
        public static final int items=0x7f05000d;
        public static final int listItemImg=0x7f05000f;
        public static final int listItemTxt=0x7f050010;
        public static final int listviewKml=0x7f05001a;
        public static final int mainLayout=0x7f05001b;
        public static final int map=0x7f050024;
        public static final int menu_behind=0x7f050028;
        public static final int menu_copy=0x7f050027;
        public static final int menu_cut=0x7f050026;
        public static final int menu_departure=0x7f05002c;
        public static final int menu_destination=0x7f05002d;
        public static final int menu_front=0x7f050029;
        public static final int menu_itinerary=0x7f05002e;
        public static final int menu_none=0x7f05002a;
        public static final int menu_paste=0x7f05002b;
        public static final int name=0x7f050012;
        public static final int navigation=0x7f05002f;
        public static final int none=0x7f050000;
        public static final int normal=0x7f050001;
        public static final int outlineColor=0x7f050015;
        public static final int outlineColorLayout=0x7f050014;
        public static final int routeInfo=0x7f050022;
        public static final int satellite=0x7f050002;
        public static final int search_panel=0x7f05001c;
        public static final int speed=0x7f050023;
        public static final int terrain=0x7f050003;
        public static final int thumbnail=0x7f05000a;
        public static final int title=0x7f05000b;
    }
    public static final class integer {
        public static final int google_play_services_version=0x7f070000;
    }
    public static final class layout {
        public static final int bonuspack_bubble=0x7f030000;
        public static final int bonuspack_bubble_black=0x7f030001;
        public static final int item_layout=0x7f030002;
        public static final int items_list=0x7f030003;
        public static final int itinerary_bubble=0x7f030004;
        public static final int kml_list_item=0x7f030005;
        public static final int kml_main=0x7f030006;
        public static final int main=0x7f030007;
    }
    public static final class menu {
        public static final int kml_item_menu=0x7f090000;
        public static final int kml_option_menu=0x7f090001;
        public static final int map_menu=0x7f090002;
        public static final int option_menu=0x7f090003;
    }
    public static final class string {
        public static final int app_name=0x7f06001a;
        /**   Title for notification shown when GooglePlayServices needs to be
        enabled for a application to work. [CHAR LIMIT=70] 
         */
        public static final int auth_client_needs_enabling_title=0x7f060015;
        /**   Title for notification shown when GooglePlayServices needs to be
        installed for a application to work. [CHAR LIMIT=70] 
         */
        public static final int auth_client_needs_installation_title=0x7f060016;
        /**   Title for notification shown when GooglePlayServices needs to be
        udpated for a application to work. [CHAR LIMIT=70] 
         */
        public static final int auth_client_needs_update_title=0x7f060017;
        /**   Title for notification shown when GooglePlayServices is unavailable [CHAR LIMIT=42] 
         */
        public static final int auth_client_play_services_err_notification_msg=0x7f060018;
        /**   Requested by string saying which app requested the notification. [CHAR LIMIT=42] 
         */
        public static final int auth_client_requested_by_msg=0x7f060019;
        /**   Title for notification shown when a bad version of GooglePlayServices
        has been installed and needs correction for an application to work.
        [CHAR LIMIT=70] 
         */
        public static final int auth_client_using_bad_version_title=0x7f060014;
        /**  Button in confirmation dialog to enable Google Play services.  Clicking it
        will direct user to application settings of Google Play services where they
        can enable it [CHAR LIMIT=40] 
         */
        public static final int common_google_play_services_enable_button=0x7f060006;
        /**  Message in confirmation dialog informing user they need to enable
        Google Play services in application settings [CHAR LIMIT=NONE] 
         */
        public static final int common_google_play_services_enable_text=0x7f060005;
        /**  Title of confirmation dialog informing user they need to enable
        Google Play services in application settings [CHAR LIMIT=40] 
         */
        public static final int common_google_play_services_enable_title=0x7f060004;
        /**  Button in confirmation dialog for installing Google Play services [CHAR LIMIT=40] 
         */
        public static final int common_google_play_services_install_button=0x7f060003;
        /**  (For phones) Message in confirmation dialog informing user that
        they need to install Google Play services (from Play Store) [CHAR LIMIT=NONE] 
         */
        public static final int common_google_play_services_install_text_phone=0x7f060001;
        /**  (For tablets) Message in confirmation dialog informing user that
        they need to install Google Play services (from Play Store) [CHAR LIMIT=NONE] 
         */
        public static final int common_google_play_services_install_text_tablet=0x7f060002;
        /**  Title of confirmation dialog informing user that they need to install
        Google Play services (from Play Store) [CHAR LIMIT=40] 
         */
        public static final int common_google_play_services_install_title=0x7f060000;
        /**  Message in confirmation dialog informing the user that they provided an invalid account. [CHAR LIMIT=NONE] 
         */
        public static final int common_google_play_services_invalid_account_text=0x7f06000c;
        /**  Title of confirmation dialog informing the user that they provided an invalid account. [CHAR LIMIT=40] 
         */
        public static final int common_google_play_services_invalid_account_title=0x7f06000b;
        /**  Message in confirmation dialog informing the user that a network error occurred. [CHAR LIMIT=NONE] 
         */
        public static final int common_google_play_services_network_error_text=0x7f06000a;
        /**  Title of confirmation dialog informing the user that a network error occurred. [CHAR LIMIT=40] 
         */
        public static final int common_google_play_services_network_error_title=0x7f060009;
        /**  Message in confirmation dialog informing user there is an unknown issue in Google Play
        services [CHAR LIMIT=NONE] 
         */
        public static final int common_google_play_services_unknown_issue=0x7f06000d;
        /**  Message in confirmation dialog informing user that date on the device is not correct,
    causing certificate checks to fail. [CHAR LIMIT=NONE] 
         */
        public static final int common_google_play_services_unsupported_date_text=0x7f060010;
        /**  Message in confirmation dialog informing user that Google Play services is not supported on their device [CHAR LIMIT=NONE] 
         */
        public static final int common_google_play_services_unsupported_text=0x7f06000f;
        /**  Title of confirmation dialog informing user that Google Play services is not supported on their device [CHAR LIMIT=40] 
         */
        public static final int common_google_play_services_unsupported_title=0x7f06000e;
        /**  Button in confirmation dialog for updating Google Play services [CHAR LIMIT=40] 
         */
        public static final int common_google_play_services_update_button=0x7f060011;
        /**  Message in confirmation dialog informing user that they need to update
        Google Play services (from Play Store) [CHAR LIMIT=NONE] 
         */
        public static final int common_google_play_services_update_text=0x7f060008;
        /**  Title of confirmation dialog informing user that they need to update
        Google Play services (from Play Store) [CHAR LIMIT=40] 
         */
        public static final int common_google_play_services_update_title=0x7f060007;
        /**  Sign-in button text [CHAR LIMIT=15] 
         */
        public static final int common_signin_button_text=0x7f060012;
        /**  Long form sign-in button text [CHAR LIMIT=30] 
         */
        public static final int common_signin_button_text_long=0x7f060013;
        public static final int departure=0x7f06001c;
        public static final int destination=0x7f06001d;
        public static final int my_position=0x7f06001b;
        public static final int viapoint=0x7f06001e;
    }
    public static final class styleable {
        /** Attributes that can be used with a AdsAttrs.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #AdsAttrs_adSize com.osmbonuspackdemo:adSize}</code></td><td>
    The size of the ad.</td></tr>
           <tr><td><code>{@link #AdsAttrs_adSizes com.osmbonuspackdemo:adSizes}</code></td><td>
    A comma-separated list of the supported ad sizes.</td></tr>
           <tr><td><code>{@link #AdsAttrs_adUnitId com.osmbonuspackdemo:adUnitId}</code></td><td> The ad unit ID.</td></tr>
           </table>
           @see #AdsAttrs_adSize
           @see #AdsAttrs_adSizes
           @see #AdsAttrs_adUnitId
         */
        public static final int[] AdsAttrs = {
            0x7f010000, 0x7f010001, 0x7f010002
        };
        /**
          <p>
          @attr description
          
    The size of the ad. It must be one of BANNER, FULL_BANNER, LEADERBOARD,
    MEDIUM_RECTANGLE, SMART_BANNER, WIDE_SKYSCRAPER, or
    &lt;width&gt;x&lt;height&gt;.
    


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.osmbonuspackdemo:adSize
        */
        public static final int AdsAttrs_adSize = 0;
        /**
          <p>
          @attr description
          
    A comma-separated list of the supported ad sizes. The sizes must be one of
    BANNER, FULL_BANNER, LEADERBOARD, MEDIUM_RECTANGLE, SMART_BANNER,
    WIDE_SKYSCRAPER, or &lt;width&gt;x&lt;height&gt;.
    


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.osmbonuspackdemo:adSizes
        */
        public static final int AdsAttrs_adSizes = 1;
        /**
          <p>
          @attr description
           The ad unit ID. 


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.osmbonuspackdemo:adUnitId
        */
        public static final int AdsAttrs_adUnitId = 2;
        /** Attributes that can be used with a MapAttrs.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #MapAttrs_cameraBearing com.osmbonuspackdemo:cameraBearing}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_cameraTargetLat com.osmbonuspackdemo:cameraTargetLat}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_cameraTargetLng com.osmbonuspackdemo:cameraTargetLng}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_cameraTilt com.osmbonuspackdemo:cameraTilt}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_cameraZoom com.osmbonuspackdemo:cameraZoom}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_mapType com.osmbonuspackdemo:mapType}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_uiCompass com.osmbonuspackdemo:uiCompass}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_uiRotateGestures com.osmbonuspackdemo:uiRotateGestures}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_uiScrollGestures com.osmbonuspackdemo:uiScrollGestures}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_uiTiltGestures com.osmbonuspackdemo:uiTiltGestures}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_uiZoomControls com.osmbonuspackdemo:uiZoomControls}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_uiZoomGestures com.osmbonuspackdemo:uiZoomGestures}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_useViewLifecycle com.osmbonuspackdemo:useViewLifecycle}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_zOrderOnTop com.osmbonuspackdemo:zOrderOnTop}</code></td><td></td></tr>
           </table>
           @see #MapAttrs_cameraBearing
           @see #MapAttrs_cameraTargetLat
           @see #MapAttrs_cameraTargetLng
           @see #MapAttrs_cameraTilt
           @see #MapAttrs_cameraZoom
           @see #MapAttrs_mapType
           @see #MapAttrs_uiCompass
           @see #MapAttrs_uiRotateGestures
           @see #MapAttrs_uiScrollGestures
           @see #MapAttrs_uiTiltGestures
           @see #MapAttrs_uiZoomControls
           @see #MapAttrs_uiZoomGestures
           @see #MapAttrs_useViewLifecycle
           @see #MapAttrs_zOrderOnTop
         */
        public static final int[] MapAttrs = {
            0x7f010003, 0x7f010004, 0x7f010005, 0x7f010006,
            0x7f010007, 0x7f010008, 0x7f010009, 0x7f01000a,
            0x7f01000b, 0x7f01000c, 0x7f01000d, 0x7f01000e,
            0x7f01000f, 0x7f010010
        };
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#cameraBearing}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.osmbonuspackdemo:cameraBearing
        */
        public static final int MapAttrs_cameraBearing = 1;
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#cameraTargetLat}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.osmbonuspackdemo:cameraTargetLat
        */
        public static final int MapAttrs_cameraTargetLat = 2;
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#cameraTargetLng}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.osmbonuspackdemo:cameraTargetLng
        */
        public static final int MapAttrs_cameraTargetLng = 3;
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#cameraTilt}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.osmbonuspackdemo:cameraTilt
        */
        public static final int MapAttrs_cameraTilt = 4;
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#cameraZoom}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.osmbonuspackdemo:cameraZoom
        */
        public static final int MapAttrs_cameraZoom = 5;
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#mapType}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>none</code></td><td>0</td><td></td></tr>
<tr><td><code>normal</code></td><td>1</td><td></td></tr>
<tr><td><code>satellite</code></td><td>2</td><td></td></tr>
<tr><td><code>terrain</code></td><td>3</td><td></td></tr>
<tr><td><code>hybrid</code></td><td>4</td><td></td></tr>
</table>
          @attr name com.osmbonuspackdemo:mapType
        */
        public static final int MapAttrs_mapType = 0;
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#uiCompass}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.osmbonuspackdemo:uiCompass
        */
        public static final int MapAttrs_uiCompass = 6;
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#uiRotateGestures}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.osmbonuspackdemo:uiRotateGestures
        */
        public static final int MapAttrs_uiRotateGestures = 7;
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#uiScrollGestures}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.osmbonuspackdemo:uiScrollGestures
        */
        public static final int MapAttrs_uiScrollGestures = 8;
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#uiTiltGestures}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.osmbonuspackdemo:uiTiltGestures
        */
        public static final int MapAttrs_uiTiltGestures = 9;
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#uiZoomControls}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.osmbonuspackdemo:uiZoomControls
        */
        public static final int MapAttrs_uiZoomControls = 10;
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#uiZoomGestures}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.osmbonuspackdemo:uiZoomGestures
        */
        public static final int MapAttrs_uiZoomGestures = 11;
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#useViewLifecycle}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.osmbonuspackdemo:useViewLifecycle
        */
        public static final int MapAttrs_useViewLifecycle = 12;
        /**
          <p>This symbol is the offset where the {@link com.osmbonuspackdemo.R.attr#zOrderOnTop}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.osmbonuspackdemo:zOrderOnTop
        */
        public static final int MapAttrs_zOrderOnTop = 13;
    };
}
