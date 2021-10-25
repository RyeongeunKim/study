import { useDispatch, useSelector } from "react-redux";
import Cpp from "../components/Cpp";
import { inc, dec } from "../modules/cpp";

// hook //connect
const CppContainer = () => {
  const num = useSelector((state) => state.cppReducer.num);
  const dispactch = useDispatch();
  return (
    <Cpp
      num={num}
      onInc={() => dispactch(inc())}
      onDec={() => dispactch(dec())}
    />
  );
};

export default CppContainer;