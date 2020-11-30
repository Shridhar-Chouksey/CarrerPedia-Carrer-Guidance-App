package com.example.carrerpedia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.carrerpedia.R;

public class IASChosenActvity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_a_sfield);

        webView=findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        webView.setBackgroundColor(Color.CYAN);

        String html ="<h2 title=\"What is meant by IAS?\">What is meant by IAS? What is the full form of IAS?</h2>"
        +"<b title=\"IAS\" full=\"\" form=\"\">IAS FULL FORM = Indian Administrative Service</b>"+
         "<p>The Indian Administrative Service is popularly referred to as the IAS and was formally constituted in 1947. It is the premier service in India and offers an attractive and challenging career. There is fame and glamour also associated with this service for those who have excell in their posts. Even though most people think being the District Magistrate or Collector is the most powerful and glamorous post, an IAS holds power at all levels of his/her job. IAS is the service that places the officer right at the top of any government organization.  If you are a determined person you can change a lot of things as an IAS officer. \n" +
                "</p>"+
                "<h2 title=\"IAS Career Profile, IAS Officer career prospects\">IAS Officer Career Profile</h2>"
        +"<p>The IAS officers handle affairs of the government. At the state and central level, this involves the framing of the policies and its implementation. At the district level, IAS is concerned with district affairs, including developmental duties. At the divisional level, the IAS officers look after law and order, general administration and various developmental works. Becoming a collector is just one of the jobs an IAS officers takes up in his long career. As secretary of various departments an IAS officer heads the organisation and takes it ahead.</p>"
                +"<h2 title=\"IAS Officer Salary, IAS Salary\">IAS Salary</h2>"
                +"<table border=4 class=\"table-responsive table-bordered\">\n" +
                "\t<tbody><tr>\n" +
                "\t\t<td>\n" +
                "\t\tGrade\n" +
                "\t\t</td>\n" +
                "\t\t<td>\n" +
                "\t\tPay Scale\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t<td>\n" +
                "\t\tApex Scale\n" +
                "\t\t</td>\n" +
                "\t\t\t\t<td>\n" +
                "\t\t₹ 80,000 (fixed)\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td>\n" +
                "\t\tAbove Super Time Scale\n" +
                "\t\t</td>\n" +
                "\t\t\t\t<td>\n" +
                "\t\t₹ 67,000-80,000\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td>\n" +
                "\t\tSuper Time Scale\n" +
                "\t\t</td>\n" +
                "\t\t\t\t<td>\n" +
                "\t\t₹37,400-₹67,000 plus grade pay of₹10000\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td>\n" +
                "\t\tSelection Grade\n" +
                "\t\t</td>\n" +
                "\t\t\t\t<td>\n" +
                "\t\t₹37,400-₹67,000 plus grade Pay of₹8700\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td>\n" +
                "\t\tJunior Administrative Grade\n" +
                "\t\t</td>\n" +
                "\t\t\t\t<td>\n" +
                "\t\t₹15,600-₹39,100 plus grade pay of₹7600\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td>\n" +
                "\t\tSenior Time Scale\n" +
                "\t\t</td>\n" +
                "\t\t\t\t<td>\n" +
                "\t\t₹15,600-₹39,100 plus grade pay of₹6600\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t<td>\n" +
                "\t\tJunior Time Scale<o:p></o:p><p></p>\n" +
                "\t\t</td>\n" +
                "\t\t\t\t<td>\n" +
                "\t\t₹15,600-₹39,100 plus grade pay of₹5400\n" +
                "\t\t</td>\n" +
                "\t</tr>\n" +
                "</tbody></table>"+
        "<h2>IAS Carrer Options</h2>"+
        "<p>Members of the Indian Administrative Service hold various administrative posts like District Collector, Heads of Departments, and Head of Public Enterprises at the state level. They can also be posted on deputation to the Central Government to various posts.\n" +
                "</p>"+
                "<h2>IAS Carrer Structure</h2>"
                +"<p>IAS being an 'All India Service' follows the Cadre system. In this system officers are allotted to state cadres, not necessarily to your home state. So for all practical purposes you belong to that state service but may be deputed elsewhere in the country. However you'll always be recognized by your allotted state cadre. This system though very useful tends to positively and negatively affect the careers of an IAS officer. The cadre system is allotted on a basis of lottery and only the toppers of each state may get a chance to serve their home state if they have opted for such a preference.\n" +
                "</p>"
                +"<h2 title=\"IAS officer career progression\">IAS Officer Career Progression</h2>"
                +"<p>\n" +
                "Besides, IAS officers can be appointed in autonomous organizations/sub ordinate organizations/PSUs/UN Organizations/international organizations like World Bank, Asian Development Bank in Various capacities. They also serve as Personal Secretaries to Ministers in Central Government. There is provision for deputation of IAS officers to private organizations also for a fixed tenure. Some of the IAS officers even become governors of states.</p>"+
                "<h2 title=\"IAS  recruitment and Training\">IAS Recruitment and Training</h2>";

        webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}