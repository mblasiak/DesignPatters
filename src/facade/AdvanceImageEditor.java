package facade;

class AdvanceImageEditor {
    private String image;
    void cropImage(){}
    void loadImage(String path){
        System.out.println("Image Loaded");
        image=path;
    }
    void changeGrayScale(){}
    void getImgHistogram(){}
    void fixRedEyeEffect(){}
    void exportImageAs(String extension){
        System.out.println("Filfe "+image+extension+" Expotrted sucesfully");
    }
    void rotate(){}
}
