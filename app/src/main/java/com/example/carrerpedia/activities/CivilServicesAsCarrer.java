package com.example.carrerpedia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.example.carrerpedia.R;

public class CivilServicesAsCarrer extends AppCompatActivity {

   WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_services_as_carrer);


     webView=findViewById(R.id.webView);
     webView.getSettings().setJavaScriptEnabled(true);
     webView.setWebViewClient(new WebViewClient());

     webView.setBackgroundColor(Color.CYAN);
        String html = "<img src=\"https://www.sakshieducation.com/hImages/UPSC_HOME.jpg\" width=\"315px\" height=\"220px\" alt=\"Image related to UPSC\">"+
                "<p class=\"margin-bottom-0\">" +
                "<ul><li>A <strong>career in civil services</strong> gives you the opportunity to <b>participate in" +
                " governance</b> and making <b>important policy decisions</b> for the country.</li> " +
                "\n"+
                "<li style=\"color:#00117d;\">There is <b>immense prestige</b> and " +
                "<b>power attached to the services</b> and one travels the lengths and breadths of the country meeting different" +
                " types of people often <b>listening to their problems</b> and <b>come up with solutions</b> to resolve those problems.</li>" +
                "\n"+
                "<li> Thus, it has immense opportunities to fulfil desire to provide <b>social service to people</b> in need and" +
                " <b>serving your country</b>.</li>" +
                "<li> Entry to these are based on <b>one of the toughest exams</b> conducted by the <mark> Union Public " +
                "Service Commission</mark>.</li></ul></p>" +
                "<ul><h2>Some Facts</h2><li>For most services, graduation with a minimum age of 21 is the eligibility criteria. Except IAS and IPS- subject of Bhutan, Nepal and Tibet refugees can apply.</li>\n" +
                "\n" +
                "<li>Selected candidates are given different posts according to the posts they get in UPSC. Civil services require" +
                " gradute degree before one goes and writes the examination. Graduation can be personal discipline from anywhere in" +
                " the country. " +
                "After this student take time to prepare for UPSC examination independently or through coaching centres. </li></ul>"
                +
                "<div class=\"col-md-12 \">\n" +
                "                  <div class=\"with-bull\">\n" +
                "                     <ul><h2>Work Description</h2><li>Be responsible for the law and order and general administration " +
                "of the area under your jurisdiction</li><li>Advise and support government officials and implement the " +
                "defined policy decisions</li><li>Handle daily affairs of the government, including framing and implementation" +
                " of policy</li><li>Liaison and consult with the Ministers and other government servants</li><li>Supervise and ensure" +
                " proper enforcement of rules and policies</li><li>Be part of the process of final policy formulation and decision " +
                "making along with high level officers and Ministers</li><li>Handle enquiries and requests from the public in person," +
                " by use of electronic &amp; social media</li></ul>                  </div>\n" +
                "               </div>"
                +"<h2>IAS Exam Pattern</h2>"+
                "<p>The IAS Exam pattern is:</p>"
                +"<ol>\n" +
                "<li>Stage I: Preliminary Examination (IAS Prelims)</li>\n" +
                "<li>Stage II: Mains Examination (IAS Mains)</li>\n" +
                "<li>Stage III: UPSC Personality Test (IAS Interview)</li>\n" +
                "</ol>"
                +"<h3>Stage I: IAS Exam – UPSC Prelims</h3>"
                +
                "<div class=\"table-responsive\"><table border=4 class=\"table border=4 table-bordered\">\n" +
                "<tbody>\n" +
                "<tr style=\"background-color: #491569; color: white;\">\n" +
                "<td><strong>Sl. No.</strong></td>\n" +
                "<td><strong>Name of the Paper</strong></td>\n" +
                "<td><strong>Nature of the Paper</strong></td>\n" +
                "<td><strong>Duration of the Exam</strong></td>\n" +
                "<td><strong>Questions</strong></td>\n" +
                "<td><strong>Marks</strong></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>1</strong></td>\n" +
                "<td><strong>IAS Exam Paper – I: General Studies</strong></td>\n" +
                "<td><strong>Merit Ranking Nature</strong></td>\n" +
                "<td><strong>2 Hours</strong></td>\n" +
                "<td><strong>100</strong></td>\n" +
                "<td><strong>200 Marks</strong></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><strong>2</strong></td>\n" +
                "<td><strong>IAS Exam Paper – II: General Studies (CSAT)</strong></td>\n" +
                "<td><strong>Qualifying Nature</strong></td>\n" +
                "<td><strong>2 Hours</strong></td>\n" +
                "<td><strong>80</strong></td>\n" +
                "<td><strong>200 Marks</strong></td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table></div>"
                +"<h3>Stage II: IAS Exam – UPSC Mains</h3>"+
                "<div class=\"table-responsive\"><table border=4 class=\"table table-bordered\">\n" +
                "<tbody>\n" +
                "<tr style=\"background-color: #491569; color: white;\">\n" +
                "<td><strong>Sl. No.</strong></td>\n" +
                "<td><strong>IAS Exam Paper</strong></td>\n" +
                "<td colspan=\"2\"><strong>Name of the Paper</strong></td>\n" +
                "<td colspan=\"2\"><strong>Nature of the Paper</strong></td>\n" +
                "<td><strong>Duration of the Exam</strong></td>\n" +
                "<td><strong>Marks</strong></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>1</td>\n" +
                "<td>Paper – A</td>\n" +
                "<td colspan=\"3\">Compulsory Indian Language</td>\n" +
                "<td rowspan=\"2\">QUALIFYING NATURE</td>\n" +
                "<td>3 Hours</td>\n" +
                "<td>300 Marks</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>2</td>\n" +
                "<td>Paper – B</td>\n" +
                "<td colspan=\"3\">English</td>\n" +
                "<td>3 Hours</td>\n" +
                "<td>300 Marks</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>3</td>\n" +
                "<td>Paper – I</td>\n" +
                "<td colspan=\"3\">ESSAY</td>\n" +
                "<td rowspan=\"7\">MERIT RANKING NATURE</td>\n" +
                "<td>3 Hours</td>\n" +
                "<td>250 Marks</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>4</td>\n" +
                "<td>Paper – II</td>\n" +
                "<td colspan=\"3\">General Studies I</td>\n" +
                "<td>3 Hours</td>\n" +
                "<td>250 Marks</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>5</td>\n" +
                "<td>Paper – III</td>\n" +
                "<td colspan=\"3\">General Studies II</td>\n" +
                "<td>3 Hours</td>\n" +
                "<td>250 Marks</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>6</td>\n" +
                "<td>Paper – IV</td>\n" +
                "<td colspan=\"3\">General Studies III</td>\n" +
                "<td>3 Hours</td>\n" +
                "<td>250 Marks</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>7</td>\n" +
                "<td>Paper – V</td>\n" +
                "<td colspan=\"3\">General Studies IV</td>\n" +
                "<td>3 Hours</td>\n" +
                "<td>250 Marks</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td>8</td>\n" +
                "<td>Paper – VI</td>\n" +
                "<td colspan=\"3\">Optional Paper I</td>\n" +
                "<td>3 Hours</td>\n" +
                "<td>250 Marks</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td rowspan=\"4\">9</td>\n" +
                "<td>Paper – VII</td>\n" +
                "<td colspan=\"3\">Optional Paper II</td>\n" +
                "<td>3 Hours</td>\n" +
                "<td>250 Marks</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"6\">TOTAL</td>\n" +
                "<td>1750 Marks</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td></td>\n" +
                "<td colspan=\"5\">Interview or Personality Test</td>\n" +
                "<td>275 Marks</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td></td>\n" +
                "<td colspan=\"5\">GRAND TOTAL</td>\n" +
                "<td>2025 Marks</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table></div>"
                ;


        webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);

    }
}