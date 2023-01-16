public class OnDemandMemory extends CondimentDecorator {

    public OnDemandMemory(Server server)
    {
        this.server = server;
    }
    @Override
    String getDescription() {
        return server.getDescription() + "OnDemandMemory , ";
    }

    @Override
    Double cost() {
        return server.cost() + 0.003067;
    }
}
