package codechicken.obfuscator;

import java.util.List;

import codechicken.obfuscator.ObfuscationMap.ObfuscationEntry;

public interface IHeirachyEvaluator
{
    /**
     * @param desc The mapping descriptor of the class to evaluate heirachy for
     * @return A list of parents (srg or obf names)
     */
    List<String> getParents(ObfuscationEntry desc);

    /**
     * @param desc The mapping descriptor of the class in question
     * @return True if this class does not inherit from any obfuscated class.
     */
    boolean isLibClass(ObfuscationEntry desc);
}
