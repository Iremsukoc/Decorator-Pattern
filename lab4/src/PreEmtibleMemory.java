public class PreEmtibleMemory extends CondimentDecorator{

    public PreEmtibleMemory(Server server)
    {
        this.server = server;
    }
    @Override
    String getDescription() {
        return server.getDescription() + "PreEmtibleMemory , ";
    }

    @Override
    Double cost() {
        return server.cost() + 0.000920;
    }
}
