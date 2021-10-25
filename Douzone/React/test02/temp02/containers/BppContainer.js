import { useDispatch, useSelector } from "react-redux";

import Bpp from "../components/Bpp";
import { inc, dec } from "../modules/bpp";

// hook //connect
const BppContainer = () => {
  const num = useSelector((state) => state.bppReducer.num);
  const dispactch = useDispatch();
  return (
    <Bpp
      num={num}
      onInc={() => dispactch(inc())}
      onDec={() => dispactch(dec())}
    />
  );
};

export default BppContainer;