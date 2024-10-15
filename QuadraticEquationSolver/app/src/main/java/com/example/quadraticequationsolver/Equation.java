package com.example.quadraticequationsolver;

import android.view.View;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.quadraticequationsolver.databinding.ActivityMainBinding;


public class Equation extends BaseObservable {
    String a;
    String b;
    String c;

    ActivityMainBinding binding;

    public Equation(ActivityMainBinding binding) {
        this.binding = binding;
    }
//
//    public MyEquation() {
//    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;

    }

    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;

    }

    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;

    }

    public void solveEquation(View view) {
        int a = Integer.parseInt(getA());
        int b = Integer.parseInt(getB());
        int c = Integer.parseInt(getC());

        double discriminant = b*b - 4*a*c;

        double X1, X2;

        if (discriminant > 0) {
            X1 = (-b + Math.sqrt(discriminant))/(2*a);
            X2 = (-b - Math.sqrt(discriminant))/(2*a);
            String R = "X1=" + X1 + "  X2=" + X2;


            binding.textView.setText(R);
        } else if(discriminant < 0) {
            binding.textView.setText("No real roots");
        } else {
            X1 = -(b) / (2*a);
            binding.textView.setText("X1=X2=" + X1);
        }


    }
}
