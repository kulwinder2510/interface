package interfacePackage;

public class SpecialStudent implements Work {
    @Override
    public void Work() {

    }

    @Override
    public void playing() {
        Work.super.playing();
    }
}
