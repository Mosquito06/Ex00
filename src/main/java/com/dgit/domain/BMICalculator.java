package com.dgit.domain;

public class BMICalculator {
	private double normal;
	private double overWeight;
	private double lowerWeight;
	private double obesity;

	public double getNormal() {
		return normal;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public double getOverWeight() {
		return overWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public double getLowerWeight() {
		return lowerWeight;
	}

	public void setLowerWeight(double lowerWeight) {
		this.lowerWeight = lowerWeight;
	}

	public double getObesity() {
		return obesity;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	public String bmiCalculator(double weight, double height){
		double h = height * 0.01;
		double result = weight / (h * h);
		
		System.out.println("BMI 지수 : " + (int) result);
	
		if(result > obesity){
			System.out.println("비만입니다.");
			return "비만입니다.";
		}else if(result > overWeight){
			System.out.println("과체중입니다.");
			return "과체중입니다.";
		}else if(result > normal){
			System.out.println("정상입니다.");
			return "정상입니다.";
		}else{
			System.out.println("저체중입니다.");
			return "저체중입니다.";
		}
	}

}
