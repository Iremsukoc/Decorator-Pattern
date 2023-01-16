public class OnDemandvCPU extends CondimentDecorator{

    public OnDemandvCPU(Server server)
    {
        this.server = server;
    }

    @Override
    String getDescription() {
        return server.getDescription() + "OnDemandvCPU , ";
    }

    @Override
    Double cost() {
        return server.cost() + 0.022890;
    }
}
